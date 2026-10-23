package com.note.demo.model;

import java.util.ArrayList;
import java.util.List;


public class Notes {


	private List<Note> noteList = new ArrayList<>();

	public List<Note> getNoteList()
	{
		return noteList;
	};

	public void setNoteList(List<Note> noteList)
	{
		this.noteList = noteList;
		
	};


};
