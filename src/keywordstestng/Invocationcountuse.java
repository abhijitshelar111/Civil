package keywordstestng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Invocationcountuse {
  @Test(invocationCount = 3)
  public void openbrowser() 
  {
	  Reporter.log("open browser is running",true);
  }
  @AfterMethod
  public void close()
  {
	  Reporter.log("closing browser",true);
  }
}
