package utils;

import models.java.DocTags;
import models.java.DocTagsVersions;
import models.java.Examples;
import models.java.Topics;

public interface JsonSenderToDb {
	public void topicsToDb(Topics topic);
	public void examplesToDb(Examples example);
	public void docTagsToDb(DocTags dokTag);
	public void docTagsVersionsToDb(DocTagsVersions docTagVersion);
}
