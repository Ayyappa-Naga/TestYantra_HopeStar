package com.practice;

import java.awt.Desktop;
import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;



public class NewFilrClass {

	    public static void main(String[] args) {
	        try {
	            // URL of the file to download
	            String fileUrl = "https://getsamplefiles.com/download/pdf/sample-1.pdf";
	            
	            // Local path where you want to save the downloaded file
	            String savePath = "D:\\"; // Update with your preferred directory
	            
	            // Download the file
	            downloadFile(fileUrl, savePath);
	            
	            // File name (extracted from the URL)
	            String fileName = fileUrl.substring(fileUrl.lastIndexOf("/") + 1);
	            
	            // Full path to the downloaded file
	            String filePath = savePath + fileName;
	            
	            // Open the downloaded file using the default system application
	       openFile(filePath);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static void downloadFile(String fileUrl, String savePath) throws IOException {
	        URL url = new URL(fileUrl);
	        try (InputStream in = url.openStream()) {
	            // Create the directory if it doesn't exist
	            Path saveDirectory = Path.of(savePath);
	            Files.createDirectories(saveDirectory);

	            // Define the path where the file will be saved
	            Path outputPath = Path.of(savePath, url.getFile().substring(url.getFile().lastIndexOf('/') + 1));

	            // Copy the downloaded content to the local file
	            Files.copy(in, outputPath, StandardCopyOption.REPLACE_EXISTING);
	      
	        }
	    }

	    public static void openFile(String filePath) {
	        try {
	            File file = new File(filePath);

	            // Check if the file exists and is readable
	            if (file.exists() && file.canRead()) {
	                // Open the file using the default system application
	                Desktop.getDesktop().open(file);
	            } else {
	                System.out.println("File not found or cannot be opened.");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    
	}
	    
}
class ss extends     NewFilrClass
{
	public static void downloadFile(String fileUrl, String savePath)
	{
		System.out.println("overridden");
	}
}