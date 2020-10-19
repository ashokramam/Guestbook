package com.guestbook.beans;

public class TextEntry extends Entry {
	private String textData;

	public void insertData(String textData) {
		this.textData = textData;
	}

	public String getTextData() {
		return textData;
	}

	public void setTextData(String textData) {
		this.textData = textData;
	}
	
}
