package com.PracticeProject;

	import java.io.FileReader;
	import java.io.IOException;

	public class Readfile { 

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			char[]data=new char[100];
	       try {
			FileReader reader=new FileReader("one.txt");
			reader.read(data);
			System.out.println(data);
			reader.close();
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			System.out.println("file not found");
		}
	    

	
	}


}
