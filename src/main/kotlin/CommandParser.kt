package org.example

import javax.swing.text.html.Option

data class CommandEntity(val commandName: Commands,
                         val commandArguments: String?,
                         val commandOptions: List<Options>?) {
}

class CommandParser {
    fun parseCommand(commandInput: String): CommandEntity{
        val commandParts =  segmentCommandIntoParts(commandInput)
        return buildCommandObjectFromParts(commandParts)
    }


    private fun buildCommandObjectFromParts(commandParts: List<String>): CommandEntity {
        val commandName = Commands.valueOf(commandParts[0].uppercase())

        val commandArguments: String = commandParts
            .drop(1)
            .filter { part ->
            part.startsWith("--").not()
        }.joinToString(" ")

        val commandParameters= commandParts
            .filter { part ->
                part.startsWith("--")
            }
            .map { part -> part.substring(2, part.length) }
            .map { option -> Options.valueOf(option.uppercase())  }


        return CommandEntity(commandName, commandArguments, commandParameters)
    }

    private fun segmentCommandIntoParts(command: String): List<String> {
        val commandParts = command.trim().split(" ")
        val removedBlankCommands = commandParts.filter { part -> part.isNotBlank() }
        val finalCommand = removedBlankCommands.filter { part -> part != "--"}
        return finalCommand
    }

}
