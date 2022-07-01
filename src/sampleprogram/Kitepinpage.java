package sampleprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitepinpage {
	@FindBy(id = "pin") private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']")private WebElement submitbutton;
	
	public Kitepinpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void sendpin()
	{
		pin.sendKeys("982278");
	}
	public void clicksubmitbutton() {
		submitbutton.click();
	}

}
