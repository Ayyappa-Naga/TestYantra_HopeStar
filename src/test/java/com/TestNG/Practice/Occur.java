package com.TestNG.Practice;


import java.util.HashMap;
import java.util.HashMap;
import java.util.HashSet;

import org.testng.annotations.Test;

public class Occur {
	@Test
	public void methods()
	{String s = "wwwpreethe";
	HashSet<Character> hs = new HashSet<Character>();
	char ch[] = s.toCharArray();
	for (char cc : ch) {
		hs.add(cc);
	}
	int m=1;

	for (char che : hs)
	{	
		while(m<ch.length)
	{
		int count = 0;
	
	
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == che) {
				count++;
				m++;
			}
				if(ch[i]!=che)
			{ 
				m++;
				System.out.println(che + " " + count);
				break;
			}
		}
		
		}
		}

	}
	@Test
	public void countCharacters() {
	        String input="wwwpreethe";
	    // Create a HashMap to store character counts
	    HashMap<Character, Integer> charCountMap = new HashMap<>();
	    char[] characters = input.toCharArray();
	    for (char c : characters) {

	        if (charCountMap.containsKey(c)) {
	            charCountMap.put(c, charCountMap.get(c) + 1);
	        } else {
	        
	            charCountMap.put(c, 1);
	        }
	    }
	    

	    for (char c : charCountMap.keySet()) {
	        int count = charCountMap.get(c);
	        System.out.print(c);
	        System.out.print(count);
	    }
	}

	}

