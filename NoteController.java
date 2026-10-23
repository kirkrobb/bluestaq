package com.note.demo.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.note.example.dao.*;
import com.note.demo.model.*;



@RestControlller

@RequestMapping ("/notes")
public class NoteController {

	private final NoteDao noteDao;

	//injection via constructor
	public NoteController(NoteDao noteDao)
	{
		this noteDao = noteDao;
	}

	
	@GetMapping
	public Notes getNotes()
	{
		return noteDao.getAllNotes();
	}
	



	@PostMapping
	public ResponseEntity<void> addNote ( @RequestBody Note note)
	{

		Integer id = NoteDao.getAllNotes().size+1;
		if(note.id = -1)
		{
			note.setId(id);
		}

		NoteDao.getAllNotes().addNote(note);	

		
	}

	URI location = ServletUriComponentsBuilder.fromCurrentRequest().path().toUri();

	return ResponseEntity.created(locatiion).build();


}

