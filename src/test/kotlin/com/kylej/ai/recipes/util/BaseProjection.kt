package com.kylej.ai.recipes.util

import com.kylej.ai.recipes.graphql.types.Recipe
import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode

class BaseProjection() : BaseSubProjectionNode<String, String>(parent = "", root = "") {
}