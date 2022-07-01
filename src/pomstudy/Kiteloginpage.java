package pomstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage {
	//variables (declare variables globally)
	//having access specifiers private to achieve encapsulation
	@FindBy(id="userid")private WebElement UN;
	@FindBy(id="password")private WebElement pass;
	@FindBy(xpath ="//button[@type='submit']") private   WebElement Loginbutton;
	
	//constructors having access specifier public
	//to initialize the variables using driver and this
	public Kiteloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//methods
	public void sendUserName()
	{
		UN.sendKeys("ELR321");
	}
	public void SendPassword()
	{
		pass.sendKeys("Dhana1111");
	}
	public void Clickonloginbutton()
	{
		Loginbutton.click();
	}
	


}
