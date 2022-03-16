package com.aditya;

import java.io.*;
import java.util.ArrayList;

class Student_Array_List {
	public static void main (String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

	
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
		
	
	if(list.indexOf(2)>=0)
		System.out.println("2 rahul in the ArrayList");
		
	else
		System.out.println("2 rahul is not in the ArrayList");
		
	if(list.indexOf(8)>=0)
		System.out.println("8 Aditya in the ArrayList");
		
	else
		System.out.println("8 Aditya is not in the ArrayList");
		
	}
}
