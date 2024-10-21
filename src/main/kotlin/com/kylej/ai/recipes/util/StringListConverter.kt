package com.kylej.ai.recipes.util

import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

/**
 * Converts a list of strings to a single string for storage in the database, and vice versa.
 */
@Converter
class StringListConverter : AttributeConverter<List<String>, String> {
    override fun convertToDatabaseColumn(stringList: List<String>): String {
        return stringList.joinToString("|")
    }

    override fun convertToEntityAttribute(dbData: String): List<String> {
        return dbData.split("|")
    }
}
