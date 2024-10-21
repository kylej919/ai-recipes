# AI Recipes

This is a sample GraphQL server written in Kotlin that uses
the [Spring AI library](https://github.com/spring-projects/spring-ai)
to communicate with chatGpt. Users can invoke endpoints to view available ingredients,
construct a list of ingredients to use in a recipe, then call 'createRecipe' referencing the
ingredient list to generate a recipe using ChatGPT.

ChatGPT generates a name for the recipe, a list of steps to make it, and even a 500-word article in the format of the
way-too-wordy online recipes popular today. Who knows, maybe you can use this server to generate your own recipe
articles

## How to run

I recommend using IntelliJ to run this project. It makes it easy to run the server by using the default run
configuration
and running the AiRecipesApplication class.

You will need your own OpenAPI api key to use the project, once you have one, add it in the application.yml config file
in the path spring.ai.openai.api-key

## Execution Path

Once the server is running, the GraphQL endpoints are meant to be invoked in this order to create a new recipe:

1. Get the list of available ingredients by invoking the 'getIngredients' query
2. Start constructing a list of ingredients by invoking the 'startIngredientSelection' mutation
3. Add ingredients to the list by invoking the 'addIngredient' mutation for as many ingredients as you would like to
   have in your recipe

- Note: The ingredients passed to this mutation must match the corresponding 'name' field for the chosen ingredient from
  the 'getIngredients' query

4. Once you have added all the ingredients you want, invoke the 'createRecipe' mutation to generate a recipe using
   ChatGPT
5. At any point, you can view the list of generated recipes by invoking the 'getRecipes' query

## GraphQL Setup

The server uses GraphQL to interact with the user. The schema can be viewed by navigating to the /graphiql endpoint when
the server is running

It's using spring-graphql, along with netflix-dgs codegen to generate the data classes, as well as client classes that
are used
in the integration tests.

The GraphQLSender class is a util class based on top of MockMVC which simplifies constructing GraphQL requests and
deserializing responses.
This is what enables using the DGS generated client code when constructing the requests. I think it's a pretty cool
pattern, feel free to reuse, of course!