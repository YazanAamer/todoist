package org.example


enum class Commands{
    ADD,
    REMOVE,
    UPDATE,
    LIST
}

enum class Options{
    OPTION1,
    OPTION2,
    OPTION3,
    OPTION4,
}

object CommandsStore {
    val commands: List<Commands> = Commands.entries
    val options: Map<Commands, List<Options>> = mapOf(
        Commands.ADD to listOf(Options.OPTION3, Options.OPTION2),
        Commands.UPDATE to listOf(Options.OPTION3, Options.OPTION3),
        Commands.REMOVE to listOf(Options.OPTION3, Options.OPTION2),
        Commands.LIST to listOf(Options.OPTION4, Options.OPTION3),
    )

    val validators: Map<Commands, CommandValidator> = mapOf(
        Commands.ADD to AddValidator()
    )

    // will be replaced with DI solution
    val localDataSource = NotesLocalStore()
    val repo = NotesRepo(localDataSource)

    val commandsFunctions: Map<Commands, CommandExecutor> = mapOf(
        Commands.ADD to AddExecutor(repo),
        Commands.LIST to ListExecutor(repo),
    )
}
