package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(name="usersSelector.selectedUser") private WebElement Dropdown;
	
	@FindBy(xpath="//a[.='Insert existing tasks']") private WebElement ExistingLink;
	@FindBy(xpath = "//a[.='Create new tasks']") private WebElement NewtaskLink;
	@FindBy(id = "SubmitTTButton") private WebElement SubmitButton;
	@FindBy(xpath = "//a[.='Logout']") private WebElement Logout;
	
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	//UTILIZATION
	
	public WebElement getDropdown() {
		return Dropdown;
	}

	public WebElement getExistingLink() {
		return ExistingLink;
	}

	public WebElement getNewtaskLink() {
		return NewtaskLink;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	public WebElement getLogoutButton() {
		return Logout;
	}
	
	//LOGOUT
	
	public void HomePageLogOut()
	{
		Logout.click();
	}
	
}
