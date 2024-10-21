package com.kylej.ai.recipes.util

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.ai.chat.client.ChatClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary


@Configuration
class UtilConfiguration {

    @Bean
    @Primary
    fun objectMapper(): ObjectMapper {
        return ObjectMapper()
    }

    @Bean
    fun chatClient(builder: ChatClient.Builder): ChatClient {
        return builder.build()
    }
}