package com.TestNG.Practice;

import org.testng.annotations.Test;

public class RotateString {
	@Test
	public void methos()
	{
		String s="Naga Durga Ayyappa";
	s=   s.replace("Naga", "");
	   
			s=s.concat(" Naga");
			System.out.println(s);
		
	}
	public boolean equals(Object obj) {
        return (this == obj);
    }

}
