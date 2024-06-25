package org.example

import java.time.LocalDate

class Note (val id: Int, val description: String)  {
    val shortDescription: String
    val date: LocalDate

    private constructor(id: Int, description: String, shortDescription: String) : this(id, description)

    init {
        shortDescription = getShortDescription(description)
        this.date = LocalDate.now()
    }


    override fun toString(): String {
        return "$id. $shortDescription"
    }

    private fun getShortDescription(description: String) = description.substring(0, getEndIndexForShortDescription(description))

    private fun getEndIndexForShortDescription(description: String):  Int{
        if(description.length < 10) return description.length
        return 10
    }

    fun copyWith(
        description: String
    ): Note {
        return Note(
            id = id,
            description = description,
            shortDescription = getShortDescription(description)
        )
    }
}