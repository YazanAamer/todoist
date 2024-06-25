package org.example
enum class CommandName {
    ADD,
    REMOVE,
    UPDATE,
    LIST
}

class CommandsLocalStore {
    val availableCommands: List<CommandName> = CommandName.entries

    val availableArguments: Map<CommandName, String> = mapOf(
        // TODO
        // Since there is no specific arguments. there should be a regex for validation
        // also there should be a better way of extracting arguments
    )

    val availableOptions: Map<CommandName, List<String>> = mapOf(
        CommandName.ADD to listOf() ,
        CommandName.REMOVE to listOf() ,
        CommandName.UPDATE to listOf() ,
        CommandName.LIST to  listOf(),
    )
}