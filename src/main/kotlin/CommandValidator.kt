package org.example

abstract class CommandValidator {
    protected fun validateFormant(command: CommandEntity): Boolean {
        if(Commands.entries.contains(command.commandName)) return true
        return false
    }
    abstract fun validate(command: CommandEntity): Boolean
}


class AddValidator: CommandValidator() {
    override fun validate(command: CommandEntity): Boolean {
        val matchesName = command.commandName == Commands.ADD
        val hasNote = command.commandArguments?.isNotEmpty() ?: false
        val optionsBelongToIt  = command.commandOptions?.all { option: Options ->
            CommandsStore.options[Commands.ADD]?.contains(option) ?: false
        } ?: false

        return validateFormant(command) &&
                matchesName &&
                hasNote &&
                optionsBelongToIt
    }
}

// TODO: Remove validator
// TODO: Update validator
// TODO: List validator
