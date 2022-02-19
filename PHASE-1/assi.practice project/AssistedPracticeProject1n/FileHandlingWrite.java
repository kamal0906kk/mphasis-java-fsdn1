package com.AssistedPracticeProject1n;


	import java.io.FileWriter;
	import java.io.FileReader;
	import java.io.IOException;
	
	public class FileHandlingWrite {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Hello.friends welcome to java files");
	       
			try {
				  FileWriter writer = new FileWriter("one.txt");
				  writer.write("hey everyone ");
			      writer.write(" "+"What Java is used for?\r\n"
			      		+ "One of the most widely used programming languages, Java is used ");
			      writer.flush();
			      writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      
	        	
		}

	 

}
