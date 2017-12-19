package models.java;

import java.sql.Date;

public class Examples {
	long id;
	long docTopicId; 
	String title;
	String description; // "BodyMarkdown" in DTO
	Date  creationDate;
    Date  lastEditDate;
	
    
    
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDocTopicId() {
		return docTopicId;
	}

	public void setDocTopicId(long docTopicId) {
		this.docTopicId = docTopicId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Examples{" +
				"id=" + id +
				", docTopicId=" + docTopicId +
				", title='" + title + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}
