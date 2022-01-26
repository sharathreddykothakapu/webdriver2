package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

@Test
public class TestNG1 {
 
  public void a() {
	  System.out.println("First method");
  }
  public void b() {
	  System.out.println("Second method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("print before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("print after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("print before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("print after class");
  }
  

  @BeforeTest
  public void beforeTest() {
	  System.out.println("print before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("print after Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("print before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("print after Suite");
  }

  
}
