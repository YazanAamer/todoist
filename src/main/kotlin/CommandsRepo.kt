package org.example

class CommandsRepo(private val commandsLocalStore: CommandsLocalStore) {

    fun isValidCommand(command: Command): Boolean {
        return commandNameIsAvailable(command.commandName) &&
                allOptionsBelongToCommand(command.commandName, command.commandOptions ?: listOf())
//                allArgumentsBelongToCommand(command.commandName.toString())
    }

    private fun commandNameIsAvailable(commandName:CommandName) = commandsLocalStore.availableCommands.contains(commandName)
    private fun allOptionsBelongToCommand(commandName: CommandName, options: List<String>): Boolean {
        val availableOptionsForCommand = commandsLocalStore.availableOptions.getOrElse(commandName) { listOf() }

        options.forEach{ option ->
            if(availableOptionsForCommand.contains(option).not())
                return false
        }
        return true
    }
//    private fun allArgumentsBelongToCommand(commandName: String) = availableArguments.containsKey(commandName)
}