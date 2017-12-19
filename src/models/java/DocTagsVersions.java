package models.java;

import java.sql.Date;

public class DocTagsVersions {
	public long id;
	public long doctagid; 
	public String title; // "Name" in DTO
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

	public long getDoctagid() {
		return doctagid;
	}

	public void setDoctagid(long doctagid) {
		this.doctagid = doctagid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "DocTagsVersions{" +
				"id=" + id +
				", doctagid=" + doctagid +
				", title='" + title + '\'' +
				'}';
	}
}
