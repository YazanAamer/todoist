package org.example

class NotesRepo (val notesLocalStore: NotesLocalStore){
    fun createNote(description: String) {
        notesLocalStore.createNote(description)
    }
    fun getAllNotes(): List<Note> = notesLocalStore.notesStore
}