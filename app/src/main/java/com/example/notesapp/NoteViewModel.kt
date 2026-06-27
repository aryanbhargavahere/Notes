package com.example.notesapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class NotesViewModel(private val repository: NoteRepository) : ViewModel() {
    val notes: Flow<List<NoteEntity>> = repository.allNotes

    fun addNote(title: String, content: String) {
        viewModelScope.launch {
            repository.insert(NoteEntity(title = title, content = content))
        }
    }

    fun deleteNote(note: NoteEntity) {
        viewModelScope.launch {
            repository.delete(note)
        }
    }
}