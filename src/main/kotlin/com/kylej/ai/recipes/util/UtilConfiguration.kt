package com.kylej.ai.recipes.util

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import org.springframework.boot.autoconfigure.web.client.RestClientBuilderConfigurer
import org.springframework.boot.web.client.ClientHttpRequestFactories
import org.springframework.boot.web.client.ClientHttpRequestFactorySettings
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import org.springframework.web.client.RestClient


@Configuration
class UtilConfiguration {

    @Bean
    @Primary
    fun objectMapper(): ObjectMapper {
        val objectMapper = ObjectMapper()
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        objectMapper.registerKotlinModule()
        return objectMapper
    }

    @Bean
    @Primary
    fun restClientBuilder(restClientBuilderConfigurer: RestClientBuilderConfigurer): RestClient.Builder {
        var builder = RestClient.builder()
            .requestFactory(ClientHttpRequestFactories.get(ClientHttpRequestFactorySettings.DEFAULTS))
        builder = restClientBuilderConfigurer.configure(builder)
        builder.messageConverters { messageConverters -> initMessageConverters(messageConverters, objectMapper()) }
        return restClientBuilderConfigurer.configure(builder)
    }


    private fun initMessageConverters(messageConverters: List<HttpMessageConverter<*>>, objectMapper: ObjectMapper) {
        messageConverters.forEach { httpMessageConverter ->
            run {
                if (httpMessageConverter is MappingJackson2HttpMessageConverter) {
                    httpMessageConverter.objectMapper = objectMapper
                }
            }
        }
    }

}