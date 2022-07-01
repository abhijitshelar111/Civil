package testNGlistener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import appbaseclass.Baseclassusinglistner;

public class Listener implements ITestListener {
	Baseclassusinglistner b=new Baseclassusinglistner();
	
	@Override
	public void onTestFailure(ITestResult result) {
		String TCname = result.getName();
		try {
			b.takescreenshot(TCname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ITestListener.super.onTestFailure(result);
	}

}
