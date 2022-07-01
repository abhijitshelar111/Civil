package pomtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {
	@FindBy(css = "span.user-id")private WebElement userid;
	@FindBy(css = "a[target='_self']") WebElement logout;
	
	public Logoutpage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	public void clickonuserid() throws InterruptedException
	{
		userid.click();
		Thread.sleep(1000);
		logout.click();
	}

}
