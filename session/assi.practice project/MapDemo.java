package com.AssistedProject;


import java.util.TreeMap;
	import java.util.Hashtable;
	import java.util.HashMap;
	import java.util.Map;
	public class MapDemo{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 HashMap<String,Integer> hashmap= new HashMap<>();
	         hashmap.put("kamal", 100);
	         hashmap.put("rohit", 200);
	         hashmap.put("rahul", 300);
	         System.out.println(hashmap);
	         System.out.println("The elements of Hashmap are ");  
		      for(Map.Entry m:hashmap.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }

	     
		      TreeMap<String,Integer> treemap= new TreeMap<>();
	         treemap.put("kalkli", 2000);
	         treemap.put("sushant", 3000);
	         treemap.put("pannu", 4000);
	         System.out.println(treemap);
	         
	         Hashtable<String,Integer> hashtable= new Hashtable<>();
	         hashtable.put("diwakr", 9000);
	         hashtable.put("deepak", 9000);
	         hashtable.put("pankaj", 8580);
	         System.out.println(hashtable);
		}

}
