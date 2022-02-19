package com.PracticeProject;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hii.friends welcome to java files");
	       
		try {
			  FileWriter writer = new FileWriter("one.txt");
			  writer.write("hey everyone ");
		      writer.write(" "+"Bubble Sort is the simplest sorting algorithm");
		      writer.flush();
		      writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
