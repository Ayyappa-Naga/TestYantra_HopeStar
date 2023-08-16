package com.TestNG.Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.hopestar.GenericUtility.BaseClass;

public class TestNG_AnnoTations_Test extends BaseClass {
    @BeforeSuite
    public void bs() {
        System.out.println("data base connected");
    }

    @BeforeClass
    public void bc() {
        System.out.println("browser launched");
    }

    @BeforeMethod
    public void bm() {
        System.out.println("Logged to application");
    }

    @Test
    public void testMethod() {
        System.out.println("Test Executed");
    }

    @Test
    public void testMethod2() {
        // Skip the Logged to application and Logged Out of application steps
        System.out.println("test 2 Executed ");
    }

    @AfterMethod
    public void am() {
        System.out.println("Logged Out of application");
    }

    @AfterClass
    public void ac() {
        System.out.println("browser Closed");
    }

    @AfterSuite
    public void as() {
        System.out.println("data base Connection Closed");
    }
}
