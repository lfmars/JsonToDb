package utils;

import java.util.List;

import models.java.DocTags;
import models.java.DocTagsVersions;
import models.java.Examples;
import models.java.Topics;



public interface ConvertJsonToList {
	public List<Topics> convertTopicsFromJson(String json);
	public List<DocTags> convertTagsFromJson(String json);
	public List<DocTagsVersions> convertDocTagsVersionsFromJson(String json);
	public List<Examples> convertExamplesFromJson(String json);
}
