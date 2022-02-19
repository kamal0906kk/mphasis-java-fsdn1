package com.AssistedProject;

import java.util.Scanner;

public class LinearSearchAlgorithm {
	public static void main(String[] args) {
		
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the value as u want?");
       int n =sc.nextInt();
       int[]arr =new int[n];
       System.out.println("Enter values"+" "+n);
       for(int i=0;i<arr.length;i++)
    	   arr[i]=sc.nextInt();
       System.out.println("Enter element you want to search?");
       int target=sc.nextInt();
       int position=-1;
       for(int i=0;i<arr.length;i++) {
    	   if(arr[i]==target) {
    		  
    		   position=i;
    		   break;
    	   }
       }
       if(position!=-1)
    	   System.out.println(target+"found!At position"+(position+1));
       else
    	   System.out.println(target+"not found!");
	

	}

}
