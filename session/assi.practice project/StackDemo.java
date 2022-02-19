package com.AssistedProject;
import java.util.Stack;

	public class StackDemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      Stack<String> stack=new Stack<>();
	      stack.push("raaju");
	      stack.push("ramanuj");
	      stack.push("manav");
	      stack.push("depak");
	      System.out.println(stack);
	      stack.pop();
	      System.out.println(stack.peek());
	      System.out.println(stack);
		}

}
