package testNgPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
  @Test
  public void sumo() {
	  Reporter.log("this is sumo method",true);
  }
  public void sumo1() {
	  Reporter.log("this is sumo1 method",true);
  }
  public void sumo2() {
	  Reporter.log("this is sumo2 method",true);
  }
}
