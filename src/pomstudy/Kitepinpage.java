package pomstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitepinpage {
	//1 data members/ variables
	@FindBy(id = "pin")private WebElement Pin;
	@FindBy(xpath = "//button[@type='submit']")private WebElement ContinueButton;
	//2 constructor
	public Kitepinpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//3 methods
	public void sendPin()
	{
		Pin.sendKeys("982278");
	}
	public void clickoncontinuebutton()
	{
		ContinueButton.click();
	}
	

	

}
