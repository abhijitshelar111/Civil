package kitewithexcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage {
	@FindBy(id = "userid")private WebElement UN;
	@FindBy(id = "password")private WebElement PWD;
	@FindBy(css = "button.button-orange.wide")private WebElement loginbutton;
	
	public Kiteloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sendusername(String username)
	{
		UN.sendKeys(username);
	}
	public void sendpassword(String pwd)
	{
		PWD.sendKeys(pwd);
	}
	public void clickloginbutton()
	{
		loginbutton.click();
	}

	

	

	

}
