package org.example

class CommandsRepo(private val commandsLocalStore: CommandsStore) {

    fun isValidCommand(command: CommandEntity): Boolean {
        return commandNameIsAvailable(command.commandName) &&
                allOptionsBelongToCommand(command.commandName, command.commandOptions ?: listOf())
//                allArgumentsBelongToCommand(command.commandName.toString())
    }

    private fun commandNameIsAvailable(commandName:Commands) = commandsLocalStore.commands.contains(commandName)
    private fun allOptionsBelongToCommand(commandName: Commands, options: List<Options>): Boolean {
        val availableOptionsForCommand = commandsLocalStore.options.getOrElse(commandName) { listOf() }

        options.forEach{ option ->
            if(availableOptionsForCommand.contains(option).not())
                return false
        }
        return true
    }
//    private fun allArgumentsBelongToCommand(commandName: String) = availableArguments.containsKey(commandName)
}