package MainPac;

import java.io.IOException;
import java.util.List;

import models.java.DocTags;
import models.java.DocTagsVersions;
import models.java.Examples;
import models.java.Topics;
import utils.ConvertJsonToList;
import utils.FileService;
import utils.JsonSenderToDb;
import utils.iplm.ConverJsonToListImpl;
import utils.iplm.FileServiceImpl;
import utils.iplm.JsonSenderToDbImpl;

public class JsonMain {

	public static void main(String[] args) throws IOException {
		FileService fileService = new FileServiceImpl();
		ConvertJsonToList convertJsonToList = new ConverJsonToListImpl();
		JsonSenderToDb jsonSenderToDb = new JsonSenderToDbImpl();
		List<Topics> topicList = convertJsonToList.convertTopicsFromJson(fileService.getFileContent("C:\\Users\\MariusP\\Eclipssssssseeeeeee3\\simple_web\\src\\externalSources\\topics.json"));
		List<Examples> examples = convertJsonToList.convertExamplesFromJson(fileService.getFileContent("C:\\Users\\MariusP\\Eclipssssssseeeeeee3\\simple_web\\src\\externalSources\\examples.json"));
		List<DocTags> docTags = convertJsonToList.convertTagsFromJson(fileService.getFileContent("C:\\Users\\MariusP\\Eclipssssssseeeeeee3\\simple_web\\src\\externalSources\\doctags.json"));
		List<DocTagsVersions> docTagsVersions = convertJsonToList.convertDocTagsVersionsFromJson(fileService.getFileContent("C:\\Users\\MariusP\\Eclipssssssseeeeeee3\\simple_web\\src\\externalSources\\doctagversions.json"));
		
		for(DocTagsVersions dt : docTagsVersions) {
			jsonSenderToDb.docTagsVersionsToDb(dt);
		}
		
		System.out.println("Topics: " + topicList.size());
		System.out.println("Examples: " + examples.size());
		System.out.println("DocTags: " + docTags.size());
		System.out.println("DocTagVersions: " + docTagsVersions.size());


	}

}
