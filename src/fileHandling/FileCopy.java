/*
 * Program to copy the contents of source file file1 to destination file file2
 * 
 */

package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class FileCopy {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file1 = new File("File1"); // Creating file object, where File1 is the source file from where contents has to be copied
										

		File file2 = new File("File2"); // Creating file object, where File2 is the destination file where contents has to be copied
									
		FileReader fileReader = new FileReader(file1); // Creates a new FileReader object, given the File to read from is from File1
														
		FileWriter fileWriter = new FileWriter(file2); // Creates a new FileWriter object, given the File to write to is to File2
												 
		BufferedReader bufferedReader = new BufferedReader(fileReader);// Creating a buffering character-input stream
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);// Creating a buffering character-input stream
		String line;// String line to store line from a source file
		line = bufferedReader.readLine();// String line holds the first line of the source file File1
		while (line != null) {// while End of file, each iteration store the contents of line to string and string is passed to the destination file
			bufferedWriter.write(line);// write lines to destination file
			bufferedWriter.newLine();
			line = bufferedReader.readLine(); // string line stores each line from source file File1
		}
		bufferedWriter.flush();// flushes the stream, this is to make sure all the contents are written to the file

		fileWriter.flush(); // flushes the stream, this is to make sure all the contents are written to the file
	

		bufferedWriter.close();
		fileWriter.close(); // closing fileWriter to avoid resouce leak
		System.out.println("File copied!!");

	}

}
