package com.note.demo.dao;


import org.springframework.stereotype.Repository;

import com.note.demo.


@Repository
class NoteDao{

	private final Notes notes = new Notes();

	public NoteDao () {};
	
	public Notes getAllNotes()
	{
		return notes;
	};
	
	public void addNote(Note note)
	{
		Notes notes = getAllNotes();
		notes.add(note);

	};








}
