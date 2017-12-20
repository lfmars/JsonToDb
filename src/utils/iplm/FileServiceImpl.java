package utils.iplm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

import utils.FileService;

public class FileServiceImpl implements FileService{

	@Override
	public String getFileContent(String path) throws IOException {
		   StringBuffer fileData = new StringBuffer();
	        BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
	        String data = reader.lines().collect(Collectors.joining());
		return data;
	}
	
}
