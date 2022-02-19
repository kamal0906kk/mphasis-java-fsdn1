package com.PracticeProject;
import java.io.File;
public class DeleteFile {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
       File myfile=new File("one.txt");
       if(myfile.delete()) {
    	   System.out.println("file deleted sucessfully");
       }
       else {
    	   System.out.println("file not found");
       }
	}

}


