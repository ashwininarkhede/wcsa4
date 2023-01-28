package testNGParallal;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG4 {
  @Test
  public void today() throws InterruptedException {
	  long threadId = Thread.currentThread().getId();
	  Reporter.log("this is today method"+threadId+"is the thread",true);
  }
  @Test
  public void tommorow()
  {
	  long threadId = Thread.currentThread().getId();
	  Reporter.log("this is  tommorow method"+threadId+"is the thread",true);
  }
}
