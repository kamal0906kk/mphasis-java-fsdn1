package com.AssistedProject;



interface First 
{  
    default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 
interface Second 
{  

default void show() 
{ 
    System.out.println("Default Second"); 
} 
} 

public class TestDiamond implements First,Second {
	
	    public void show() 
	    {  
	        First.super.show(); 
	        Second.super.show(); 
	    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TestDiamond ob = new TestDiamond(); 
        ob.show(); 

	}

}
