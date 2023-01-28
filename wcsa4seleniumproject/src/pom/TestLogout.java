package pom;

import java.io.IOException;

public class TestLogout extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		
		Flib flib =new Flib();
		LoginPage lp=new LoginPage(driver);
		
		
		String usn = flib.readPropertyData(PROP_PATH, "Username");
		String pass = flib.readPropertyData(PROP_PATH, "Password");
		
		lp.actiTimeValidLogin(usn, pass);
		
		HomePage hp=new HomePage(driver);
		hp.HomePageLogOut();

	}

}
