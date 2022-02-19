package com.AssistedProject;

public class Array {
	public static void main(String[] args) {
	
		//single-dimensional array
		int a[]= {101,202,303,404,505};
		for(int i=0;i<5;i++) {
		System.out.println("Elements of array a: "+a[i]);
		}
		//multidimensional array
		int[][] b = {
		            {2, 4, 6, 8}, 
		            {3, 6, 9}, 
		            {4 ,6 ,8}};
		      
		      System.out.println("\nLength of row 3: " + b[2].length);
		      System.out.println("\nLength of row 1: " + b[0].length);
		      }


}
