package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Collection_Pr_test {
 char ch;
	public static void main(String[] args) {
		//List 
		
		List<Object>  li = new  ArrayList<>();
		li.add("Noone");
		
		li.add("SomeOne");
		li.add("SomeOne");
		li.add("SomeOne");
		li.add("SomeOne");
		li.add("AnyOne");
		li.add(12);
		li.add(12);
		li.add(2);
		li.add(12);
		li.add(12);
		li.add(12);
		li.add(12);
		li.add(12);
		
		  Comparator<Object> customComparator = (o1, o2) -> {
	            if (o1 instanceof Integer && o2 instanceof Integer) {
	                return Integer.compare((Integer) o1, (Integer) o2);
	            } else if (o1 instanceof String && o2 instanceof String) {
	                return ((String) o1).compareTo((String) o2);
	            } else {
	                // Handle other types as needed
	                return 0; // No specific ordering for other types
	            }
	        };
	        Collections.sort(li, customComparator);
		System.out.println(li);
		

		
		//Queue
		Queue<Object> qq = new PriorityQueue<Object>();
		qq.add("AnyBody");
		qq.add("SomeBody");
		qq.add("SomeBody");
		qq.add("Noone");
		qq.add("SomeBody");
		
		

		   ArrayList<Integer> list = new ArrayList<>();
	        
	        // The initial capacity of 'list' is 10
	        
	        for (int i = 0; i < 15; i++) {
	            list.add(i);
	        }
	        
	        System.out.println("Size of list: " + list.size()); // Output: 15
		
		
		qq.add("NoBody");
		System.out.println(qq);
		 qq.poll();
		System.out.println(qq);
		System.out.println();
		 qq.peek();
		System.out.println(qq);
		
		//Set
		Set<Object> se = new HashSet<Object>();
		se.add(56);
		se.add(20);
		se.add(5);
		se.add(6);
		se.add(null);
		se.add("ravi");
		se.add(null);
		System.out.println(se);
		
		Set<Object> sl = new LinkedHashSet<>();
		sl.add("ravi");
		sl.add("ravi");
		sl.add("Kumar");

		sl.add(null);
		sl.add(45);
		sl.add(null);
		System.out.println(sl);
		
		Set<Object> st = new TreeSet<Object>();
		st.add("New ");
		st.add("Old ");
		try {
			st.add(45);  //Class Cast Exception
		} catch (Exception e) {
			
		}

		st.add(null);
		st.add("Current ");
		System.out.println(st);
		
		
		
	}

}
