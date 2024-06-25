package org.example

data class Command(val commandName: CommandName,
                   val commandArguments: List<String>?,
                   val commandOptions: List<String>?) {
}

class CommandParser {
    fun parseCommand(commandInput: String): Command{
        val commandParts =  segmentCommandIntoParts(commandInput)
        return buildCommandObjectFromParts(commandParts)
    }


    private fun buildCommandObjectFromParts(commandParts: List<String>): Command {
        val commandName = CommandName.valueOf(commandParts[0].uppercase())

        val commandArguments: List<String> = commandParts
            .takeLast(commandParts.size -1)
            .filter { part ->
            part.startsWith("--").not()
        }
        val commandParameters= commandParts
            .filter { part ->
                part.startsWith("--")
            }


        return Command(commandName, commandArguments, commandParameters)
    }

    private fun segmentCommandIntoParts(command: String): List<String> {
        val commandParts = command.trim().split(" ")
        val removedBlankCommands = commandParts.filter { part -> part.isNotBlank() }
        val finalCommand = removedBlankCommands.filter { part -> part != "--"}
        return finalCommand
    }

}
