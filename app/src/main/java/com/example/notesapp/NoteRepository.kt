package com.example.notesapp

import kotlinx.coroutines.flow.Flow

class NoteRepository(private val dao: NoteDao) {

    val allNotes: Flow<List<NoteEntity>> = dao.getAllNotes()

    suspend fun insert(note: NoteEntity) {
        dao.insertNote(note)
    }

    suspend fun delete(note: NoteEntity) {
        dao.deleteNote(note)
    }
}