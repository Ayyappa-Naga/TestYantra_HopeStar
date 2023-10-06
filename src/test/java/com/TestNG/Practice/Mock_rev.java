package com.TestNG.Practice;

import org.testng.annotations.Test;

public class Mock_rev {
	@Test
	public void method()
	{
		int a[]= {5,4,9,7,6,2};
		for(int j=0;j<(a.length)/2;j++)
		{
			System.out.println(a[j]);
		}
				
			
		
		for(int i=a.length-1;i>=(a.length)/2;i--)
		{
			System.out.println(a[i]);
		}
	
	

}}
