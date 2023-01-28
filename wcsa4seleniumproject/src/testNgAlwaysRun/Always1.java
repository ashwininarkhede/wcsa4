package testNgAlwaysRun;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Always1 {
  @Test
  public void run() {
	 Assert.fail();
	 Reporter.log("this is run method",true);
	
  }
}
