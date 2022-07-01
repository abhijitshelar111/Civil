package sampleprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage {
	//data members
	@FindBy(css = "input#userid")private WebElement UN;
	@FindBy(css = "input[type='password']")private WebElement pwd;
	@FindBy(css = "button.button-orange.wide")private WebElement loginbutton;
	//constructor
	public Kiteloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//methods
	public void sendusername()
	{
		UN.sendKeys("ELR321");
	}
	public void sendpassword()
	{
		pwd.sendKeys("Dhana1111");
	}
	public void clickloginbutton()
	{
		loginbutton.click();
	}
	
	

}
