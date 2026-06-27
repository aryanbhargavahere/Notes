package com.example.notesapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class NotesViewModel : ViewModel() {
    private val _notes = MutableStateFlow<List<Note>>(emptyList())
    val notes: StateFlow<List<Note>> = _notes

    fun addNote(title: String, body: String) {
        val new = Note(title = title, body = body)
        _notes.value = listOf(new) + _notes.value
    }
}