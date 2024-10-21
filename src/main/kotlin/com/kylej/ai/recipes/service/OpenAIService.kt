package com.kylej.ai.recipes.service

import com.fasterxml.jackson.databind.ObjectMapper
import com.kylej.ai.recipes.model.IngredientListModel
import com.kylej.ai.recipes.service.entity.RecipeResponse
import org.springframework.ai.openai.OpenAiChatModel
import org.springframework.stereotype.Service

@Service
class OpenAIService(
    private val chatModel: OpenAiChatModel,
    private val objectMapper: ObjectMapper
) {

    /**
     * Create a recipe using the given ingredients by calling the OpenAI chat model
     */
    fun createRecipeInstructions(ingredientList: IngredientListModel): RecipeResponse {
        var responseString = chatModel.call(getPromptString(ingredientList))
        responseString.indexOfFirst { it == '{' }
        responseString.indexOfLast { it == '}' }
        responseString = responseString.substring(responseString.indexOfFirst { it == '{' },
            responseString.indexOfLast { it == '}' } + 1)

        return objectMapper.readValue(responseString, RecipeResponse::class.java)
    }

    private fun getPromptString(ingredientList: IngredientListModel): String {
        val ingredients: List<String> = ingredientList.ingredients.map { it.name }
        return """
            create a recipe with the following ingredients:
            ${ingredients.joinToString(", ")}

            return the response in a flat json object with 2 fields:
            1. A field called 'name' which is a name for the recipe
            2. A field named 'instructions' which is an json array of instructions to make the recipe
            3. A field named 'article' which is a 500 word article from the point of view of the recipe creator, describing the recipe
        """.trimIndent()

    }
}