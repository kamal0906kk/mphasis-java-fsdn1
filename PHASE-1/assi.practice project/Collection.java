package com.AssistedProject;


	import java.util.ArrayList;
	import java.util.Vector;
	import java.util.LinkedList;
	import java.util.LinkedHashSet;
	import java.util.HashSet;
	import java.util.Iterator;

	public class Collection {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("ArrayList");
			ArrayList<String> city=new ArrayList<String>();   
		      city.add("noida");//
		      city.add("Pune");    	   
		      System.out.println(city);  

			
			//creating vector
		      System.out.println("\n");
		      System.out.println("Vector");
		      Vector<Integer> vec = new Vector();
		      vec.addElement(148); 
		      vec.addElement(26);
		      vec.addElement(29);
		      System.out.println(vec);
			
			//creating linkedlist
		      System.out.println("\n");
		      System.out.println("LinkedList");
		      LinkedList<String> names=new LinkedList<String>();  
		      names.add("rohit");  
		      names.add("rahul");
		      names.add("ramal");  	
		      Iterator<String> itr=names.iterator();  
		      while(itr.hasNext()){  
		       System.out.println(itr.next());  
		      }
		      
		       //creating hashset
		       System.out.println("\n");
		       System.out.println("HashSet");
		       HashSet<Integer> set=new HashSet<Integer>();  
		       set.add(89);  
		       set.add(90);  
		       set.add(91);
		       set.add(92);
		       System.out.println(set);
		       
		       //creating linkedhashset
		       System.out.println("\n");
		       System.out.println("LinkedHashSet");
		       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
		       set2.add(6);  
		       set2.add(8);  
		       set2.add(66);
		       set2.add(77);	       
		       System.out.println(set2);
		}
	}
		



	
