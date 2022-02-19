package com.AssistedPracticeProject1n;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingRead {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         char [] data=new char[100];
         try {
			FileReader reader=new FileReader("one.txt");
			reader.read(data);
			System.out.println("Data received from the file");
			System.out.println(data);
			reader.close();
			
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			System.out.println("File read error");
		}
         
         }

}
