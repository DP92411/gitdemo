package com.cognizant.demo;
class A extends Thread(){ 
	public void run(){ 
		for(int i=0;i<10;i++) {
			System.out.println("hi");
		}
		}
	
	}

class B extends Thread() {
   public void run(){ 
		for(int i=0;i<10;i++) {
			System.out.println("hi");
		}
		}
}

public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
