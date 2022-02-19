package com.AssistedProject;

public class TryCatch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] array = new int[3];
        try 
        {
            array[8] = 4;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
        	 System.out.println("Array index is out of bounds!"); 
        }
        finally 
        {
            System.out.println("The array is of size " + array.length);
        }

        }

	}

	


