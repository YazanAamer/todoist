package org.example

abstract class CommandExecutor {
    abstract fun execute(command: CommandEntity)
}

class AddExecutor(val notesRepo: NotesRepo): CommandExecutor() {
    override fun execute(command: CommandEntity) {
        notesRepo.createNote(command.commandArguments.toString())
    }
}

class ListExecutor(val notesRepo: NotesRepo): CommandExecutor() {
    override fun execute(command: CommandEntity) {
        val notes = notesRepo.getAllNotes()
        notes.forEachIndexed{ index, note ->
            println("$index. ${note.description}")
        }
    }
}
