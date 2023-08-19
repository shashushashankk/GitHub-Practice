package TYSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice1 {
	@Test(priority = -1)
	public void shashank()
	{
		Reporter.log("hii",true);
	}
	@Test(priority = 0)
	public void sachi() {
		Reporter.log("bye", true);
	}
}
