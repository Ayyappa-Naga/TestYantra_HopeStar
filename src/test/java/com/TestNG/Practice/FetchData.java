package com.TestNG.Practice;

import org.testng.annotations.Test;

public class FetchData {
	@Test(dataProviderClass = DataProviding_from_SameClass.class,dataProvider = "dataObj2",dependsOnMethods = "fetchingData")
	public void fetchingData(String city ,int  Distance,String state )
	{
		System.out.println("city:"+city+"    Distance :"+Distance+"  state :"+state);
	}
	
	
	
	
	@Test(dataProviderClass = DataProviding_from_SameClass.class,dataProvider = "dataObj")
	public void fetchingData(String city ,String State)
	{
		System.out.println("city:"+city+"    state :"+State);
	}
	
	
	
	@Test(dataProviderClass = DataProviding_from_SameClass.class,dataProvider = "dataObj3")
	public void fetchingData(String City,int price) 
	{
		System.out.println("city:"+City+"    price :"+price);
		
	}

}
