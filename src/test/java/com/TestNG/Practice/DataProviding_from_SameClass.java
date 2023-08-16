package com.TestNG.Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviding_from_SameClass {
@Test(dataProvider = "dataObj")
	public void dataMethod(String city,String State) 
   {
		
		System.out.println("City:"+city+"   state:"+State);

	}
@DataProvider
public Object[][] dataObj()
{
	

Object[][] obj=new Object[2][2];
obj[0][0]="Bengaluru";
obj[0][1]="Karntaka";

obj[1][0]="Vijayawada";
obj[1][1]="AndhraPraddesh";
return obj;

}


@DataProvider
public Object[][] dataObj2()
{
Object[][] obj1=new Object[2][3];
obj1[0][0]="Hyderabad";
obj1[0][1]=500;
obj1[0][2]="Telangana";


obj1[1][0]="Delhi";
obj1[1][1]=1200;
obj1[1][2]="Delhi";
return obj1;

}

@DataProvider
public Object[][] dataObj3()
{
	

Object[][] obj=new Object[2][2];
obj[0][0]="Bengaluru";
obj[0][1]=5000;

obj[1][0]="Vijayawada";
obj[1][1]=2000;
return obj;

}

}