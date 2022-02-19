package com.AssistedProject;
import java.util.PriorityQueue;


public class QueueDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PriorityQueue<Integer> queue =new PriorityQueue<>();
     queue.add(101);
     queue.add(102);
     queue.add(103);
     queue.add(104);
     System.out.println(queue);
     queue.poll();
     System.out.println(queue.peek());
     System.out.println(queue);
	}

}
