package com.guestbook.rest;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.guestbook.beans.Entry;
import com.guestbook.dao.EntryDAO;

@RestController
public class EntriesService {
	
	// @RestService ()
	public void addEntry() {
		
	}

	public List<Entry> getAllEntries(){
		
		return new EntryDAO().getAllEntries();
		
	}
}
