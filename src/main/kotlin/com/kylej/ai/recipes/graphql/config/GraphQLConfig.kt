package com.kylej.ai.recipes.graphql.config

import graphql.scalars.ExtendedScalars
import graphql.schema.Coercing
import graphql.schema.idl.RuntimeWiring
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.graphql.execution.RuntimeWiringConfigurer
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.*

val SCALARS = mapOf<Class<*>, Coercing<*, *>>(
    LocalDateTime::class.java to ExtendedScalars.DateTime.coercing,
    UUID::class.java to ExtendedScalars.UUID.coercing,
    Long::class.java to ExtendedScalars.GraphQLLong.coercing,
    BigDecimal::class.java to ExtendedScalars.GraphQLBigDecimal.coercing
)

@Configuration
class GraphQLConfig {

    @Bean
    fun runtimeWiringConfigurer(): RuntimeWiringConfigurer {
        return RuntimeWiringConfigurer { wiringBuilder: RuntimeWiring.Builder ->
            wiringBuilder.scalar(ExtendedScalars.DateTime)
                .scalar(ExtendedScalars.UUID)
                .scalar(ExtendedScalars.GraphQLLong)
                .scalar(ExtendedScalars.GraphQLBigDecimal)
        }
    }
}