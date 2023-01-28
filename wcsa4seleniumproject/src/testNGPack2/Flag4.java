package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void logInMethod() {
	  Reporter.log("LogIn is done!!",true);
  }
  @Test(dependsOnMethods = "logInMethod")
  public void createUser() {
	  Reporter.log("user created!!",true);
  }
  @Test(dependsOnMethods = "createUser")
  public void logoutMethod() {
	  Reporter.log("Logout is done!!",true);
  }
  
}
