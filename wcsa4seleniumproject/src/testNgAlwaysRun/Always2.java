package testNgAlwaysRun;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Always2 {
  @Test(alwaysRun = true)
  public void run2() {
	  Reporter.log("this is run2",true);
  }
}
