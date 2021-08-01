package activities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Activity14 {
	public static void main(String[] args) throws IOException {
		File file = new File("newfile.txt");
		try {
			boolean fStatus = file.createNewFile();
			if(fStatus) 
				System.out.println("New file created successfully");
			else 
				System.out.println("File already exists at this path.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Get File
		File fileUtil = FileUtils.getFile("newfile.txt");
		// Write 
		FileUtils.write(fileUtil, "Reading files with FileUtils");
		// Read
		String fileContent = FileUtils.readFileToString(fileUtil);
		System.out.println("Data in file: "+fileContent);
		
		// Create Directory
		File newDir = new File("resources.txt");
		// Copy file
		FileUtils.copyFile(file, newDir);
		
		// Get File from new directory
		File newFile = FileUtils.getFile("resources.txt");
		// Read File Content
		System.out.println("Content in new file: "+FileUtils.readFileToString(newFile));
	}
}
