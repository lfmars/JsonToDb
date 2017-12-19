package models.java;

import java.sql.Date;

public class Topics {
	long id;
	long docTagId;
	String title;
	String answer; // "RemarksMarkdown" in DTO
	Date creationDate;
	Date lastEditDate;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getDocTagId() {
		return docTagId;
	}
	public void setDocTagId(long docTagId) {
		this.docTagId = docTagId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getLastEditDate() {
		return lastEditDate;
	}
	public void setLastEditDate(Date lastEditDate) {
		this.lastEditDate = lastEditDate;
	}
	
	
}
