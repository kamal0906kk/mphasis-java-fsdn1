package com.AssistedProject;
import java.util.Scanner ;

public class BubbleSort {
	
	    void bubbleSort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    
	                    int temp = arr[j];
	             
	                      arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	    }	 
	    void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	 
	    public static void main(String args[])
	    {
	    	
	    	int n;
	    	Scanner sc = new Scanner (System.in);
	    	int[]  arr =new int [6]; 
	    	  System.out.println("Enter "+ arr.length  + " integer values:");
	    	  for(int i=0; i < arr.length; i++) {
	    	      // read input
	    	      arr[i] = sc.nextInt();
	    	    }
	    	  BubbleSort ob = new BubbleSort();
	       
	        
	        ob.bubbleSort(arr);
	        System.out.println("Sorted array");
	        ob.printArray(arr);
	    }
	}

