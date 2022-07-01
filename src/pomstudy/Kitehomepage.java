package pomstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitehomepage {
	//1 data member/ variables 
	@FindBy(xpath = "//span[@class='user-id']")private WebElement UserId;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logout;
	//2 constructor
	public Kitehomepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//3 methods
	public void validateuserid()
	{
		String actualuserid = UserId.getText();
		String expecteduserid="ELR321";
		if(actualuserid.equals(expecteduserid))
		{
			System.out.println("userid is matching TC is passed");
		}
		else
		{
			System.out.println("userid is not matching TC is failed");
		}
	}
	public void clickonlogout() throws InterruptedException
	{
		UserId.click();
		Thread.sleep(1000);
		logout.click();
	}
	

}
