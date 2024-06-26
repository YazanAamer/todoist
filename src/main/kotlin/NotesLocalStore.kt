package org.example

class NotesLocalStore {
    //  Database implementation goes here
    val notesStore: MutableList<Note> = mutableListOf()
    var notesNumber: Int = 0

    fun createNote(description: String) = notesStore.add(Note(
        id = notesNumber++,
        description = description,
    ))
    fun deleteNote(note: Note) = notesStore.removeIf{storedNote -> storedNote.id == note.id}
    fun updateNote(note: Note) = notesStore.find { storedNote ->
        storedNote.id == note.id
    }.also {
        it?.copyWith(note.description)
    }
    fun allNotes(note: Note): List<Note> = notesStore
}