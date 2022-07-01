package kitewithexcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitepinpage {
	@FindBy(id = "pin")private WebElement PIN;
	@FindBy(css = "button.button-orange.wide")private WebElement continuebutton;
    
	public Kitepinpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	public void sendpin(String pin)
	{
		PIN.sendKeys(pin);
	}

	public void clickcontinuebutton()
	{
		continuebutton.click();
	}
	

}
