package com.kylej.ai.recipes.service

import com.kylej.ai.recipes.model.IngredientListModel
import com.kylej.ai.recipes.repository.manager.RecipeRepositoryManager
import com.kylej.ai.recipes.service.entity.RecipeResponse
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.jdbc.Sql

@SpringBootTest
@ActiveProfiles(profiles = ["test", "personal"])
@Sql(scripts = ["classpath:sql/ingredient-list.sql"])
class OpenAIServiceIT {

    @Autowired
    private lateinit var openAIService: OpenAIService

    @Autowired
    private lateinit var recipeRepositoryManager: RecipeRepositoryManager


    @Test
    fun testOpenAIResponse() {
        val apple = recipeRepositoryManager.getIngredientByName("Apple")
        val chicken = recipeRepositoryManager.getIngredientByName("Chicken")
        val ingredientList = IngredientListModel()
        ingredientList.ingredients.add(apple)
        ingredientList.ingredients.add(chicken)
        val response: RecipeResponse = openAIService.createRecipeInstructions(ingredientList)
        assert(response.name.isNotEmpty())
        assert(response.instructions.isNotEmpty())
    }
}