package org.example

object Utils {
    fun <T> getArrayElementSafely(array: List<T>, index: Int): T? {
        return if (index in array.indices) array[index] else null
    }
}