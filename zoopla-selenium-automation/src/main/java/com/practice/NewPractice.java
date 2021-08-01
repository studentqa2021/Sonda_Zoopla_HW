package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NewPractice {

	Set<Integer> obj=new HashSet<>();
	
	
	public Set<Integer>getValue() {
	obj.add(2);
	obj.add(6);
	obj.add(3);
	obj.add(8);
	obj.add(9);
	//int max=Collections.max(obj);
	//int min=Collections.min(obj);
  return obj;	//System.out.println(obj);
}
	public static void main(String[] args) {
		
		Set<Integer>value=new NewPractice().getValue(); 
		
		System.out.println();
		
	}
}
