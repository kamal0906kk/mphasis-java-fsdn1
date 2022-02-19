package com.AssistedProject;



	class Hi implements Runnable{
		public void run()  {
			for(int i=0;i<5;i++) {
				System.out.println("hiii");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			
		}
		}
	 class Hello implements Runnable{
		public void run() {
			for(int i=0;i<5;i++) {
				System.out.println("hello");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		}
		
	}
	 
  public class ThreadConceptDemo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi obj1=new Hi();
		Hello obj2=new Hello();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
	    t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();

	}
  }


