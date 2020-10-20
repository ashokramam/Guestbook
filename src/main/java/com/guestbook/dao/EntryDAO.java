package com.guestbook.dao;

import java.util.List;

import com.guestbook.beans.Entry;
import com.guestbook.beans.ImageEntry;

public class EntryDAO {
	
	public List<Entry> getAllEntries(){
		return null;
	}

	public void addEntry(Entry e) {
		String entryType = e instanceof ImageEntry?"Image":"Text";
		System.out.println("Entry type is"+entryType);
	}
	
	public void approveEntry(Entry e) {
		// Add appropriate logic. 
	}
}
