package kitewithexcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitehomepage {
	@FindBy(css = "span.user-id") private WebElement USERID;
	@FindBy(css = "a[target='_self']")private WebElement LOGOUT;
	@FindBy(css = "a.remove.text-xxsmall")private WebElement changeuser;
	
	public Kitehomepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public String actualuserid() {
	String actualuser = USERID.getText();
	return actualuser;}
	
	public void validateuserid(String username)
	{
		String actualuserid = USERID.getText();
		String expecteduserid=username;
		if(actualuserid.equals(expecteduserid))
		{
			System.out.println("userid is match TC is passed");
		}
		else
		{
			System.out.println("userid is not match TC is failed");
		}
	}
	
	public void clicklogout() throws InterruptedException
	{
		USERID.click();
		Thread.sleep(1000);
		LOGOUT.click();
		}
	public void clickonchangeuser ()
	{
		changeuser.click();
	}
	
	
	

}
