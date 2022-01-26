package TestNg;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test2 {
 
  @Test (groups="Smoke")
  public void a() {
	  System.out.println("First ");
  }
  @Test (groups="Regression")
  public void b() {
	  System.out.println("second");
  }
  @Test (groups="Smoke")
  public void c() {
	  System.out.println("Third");
  }
  @Test (groups="Regression")
  public void d() {
	  System.out.println("Fourth");
  }


 @Test
 public class test2_dependonmethods{
	 @Test  (dependsOnMethods= "c")  
    public void a( ) {
  	  System.out.println("First method");
         }
	 @Test
    public void b() {
  	  System.out.println("Second method");
         }
	 @Test
    public void c() {
    	  System.out.println("Third method");
         }
	 @Test(dependsOnMethods ="a")
    public void d() {
    	  System.out.println("Fourth method");
         }
    
	 
	 public class test3_Priority{
		 
		 
		 @Test  (priority=3)  
	    public void a( ) {
	  	  System.out.println("First method");
	         }
		 @Test
	    public void b() {
	  	  System.out.println("Second method");
	         }
		 @Test
	    public void c() {
	    	  System.out.println("Third method");
	         }
		 @Test(priority=4)
	    public void d() {
	    	  System.out.println("Fourth method");
	         }
	  
	     } 
	     


 public class test4_Groups{
		 
		 
		 @Test(groups="smoke")
	    public void a( ) {
	  	  System.out.println("First method");
	         }
		 @Test(groups="regression")
	    public void b() {
	  	  System.out.println("Second method");
	         }
		 @Test(groups="smoke")
	    public void c() {
	    	  System.out.println("Third method");
	         }
		 @Test(groups="regression")
	    public void d() {
	    	  System.out.println("Fourth method");
	         }
 }
         


@Test
public class test5_parallelTesting{
		 
		 @Test
	     public void a( ) {
	   	  System.out.println("Thread value is "+Thread.currentThread().getId());
	      System.out.println("Google_Chrome");
	  	   }
		 
		 @Test
	     public void b() {
			 System.out.println("Thread value is "+Thread.currentThread().getId());
			 System.out.println("Firefox");
		   }
		 
		 @Test
		 public void c() {
	      System.out.println("Thread value is "+Thread.currentThread().getId());
	      System.out.println("Microsoft_Edge");
         }
		 
		 @Test
	     public void d() {
	      System.out.println("Yauhooo");
	  	  System.out.println("Thread value is "+Thread.currentThread().getId());

	         }
}

@Test
public class test6_dataprovider{
		 
		 @Test(dataProvider="addition")
	     public void sum(int a ,int b, int expected_value) {
		       int c =a+b ;
		       Assert.assertEquals(c, expected_value);
		 }
		@Test(dataProvider="substraction")
		 public void sub(int a , int b , int expected_value) {
			   int c = a-b;
			   Assert.assertEquals(c, expected_value);
			   }
		
	     @DataProvider(name="addition")
		 public Object[][] getData1(){
			 Object[][] t1 = new Object[][] {
				 {10,20,30},
				 {20,30,50},
				 {20,10,40}
				};
		 
			 return t1;
			 }
			 
	     @DataProvider(name="substraction")
		 public Object[][] getData(){
			 Object[][] t2 = new Object[][] {
				 {40,10,30},
				 {60,40,50},
				 {80,40,40}
				};
		 
			 return t2;
			 }
        }
 
    }
}
			 
		 
		 
		 
 

    
 
      