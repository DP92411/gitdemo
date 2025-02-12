package com.cognizant.demo;
import java.util.*;
public class Hello2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList<Integer> arr1 = new ArrayList<>();
          
          arr1.add(2);
          arr1.add(4);
          arr1.add(5);
          arr1.add(9);
          
          for(int i:arr1) {
        	  if(arr1.contains(4))
        	  System.out.println("4 is present!");
        	  break;
          }
          
          
		ArrayList<String> newStr = new ArrayList<>();
		newStr.add("aman");
		newStr.add("amit");
		newStr.add("amey");
		newStr.add("abishek");
		for(String s:newStr){
			System.out.println(s);
		}
		try {
		System.out.println(arr1.remove(2));}
		catch(Exception e){
			System.out.println(e);
		}
		
		arr1.set(0, 99);
		System.out.println(arr1.get(0));
	}

	

}
