package sampleprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitehomepage {
	@FindBy(xpath = "//span[@class='user-id']") private  WebElement userid;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logout;
	
	public Kitehomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getuserid()
	{
		String actualuserid = userid.getText();
		String expecteduserid="ELR321";
		if(actualuserid.equals(expecteduserid))
		{
			System.out.println("userid is matching TC is passed");
		}
		else {
			System.out.println("userid is not matching TC is failed");
			
		}
			
	}
	public void clicklogoutbutton() throws InterruptedException
	{
		userid.click();
		Thread.sleep(1000);
		logout.click();
	}

}
