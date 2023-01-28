package testNgPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	 // System.out.println("hello");
	  Reporter.log("This is f method!",true);
  }
  @Test
  public void f1()
  {
	  Reporter.log("This is f1 method!",true); 
  }
  @Test
  public void f2()
  {
	  int a=10;
	  int b=0;
	  int res=a/b;
	  Reporter.log("This is f2 method!",true); 
	  
  }
  
}
