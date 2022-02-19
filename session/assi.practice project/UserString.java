package com.AssistedProject;



import java.util.ArrayList;
import java.util.Scanner;


public class UserString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
				boolean flag=false;
				ArrayList<String> list=new ArrayList<String>();
				list.add("baran@gmail.com");
				list.add("vijay@gmail.com");
				list.add("pankaj@gmail.com");
				System.out.println(list);
				System.out.println("Enter the email?");	
				Scanner sc =new Scanner(System.in);
				String input=sc.next();
				
				for( int i=0;i<list.size();i++) {
		        if(list.contains(input)) {
		        	System.out.println("Valid email");
		        	flag =true;
		        	break;
		        }
				}
		        if (flag==false) {
		        	System.out.println("Invalid email");
		        
		        }
		        
	}
}

		        
	
	
				

			

		
	


