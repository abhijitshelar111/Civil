package keywordstestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
  @Test
  public void p() 
  {
	  Reporter.log("method p is running",true);
  }
  @Test(priority = -1)
  public void q() 
  {
	  Reporter.log("method q is running",true);
  }
  @Test(priority = -2)
  public void s() 
  {
	  Reporter.log("method s is running",true);
  }
  @Test
  public void r() 
  {
	  Reporter.log("method r is running",true);
  }
  @Test(priority = -1)
  public void t() 
  {
	  Reporter.log("method t is running",true);
  }
}
