package Practice125;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class test {
	@Test(priority=1,invocationCount = 2)
	public void compose()
	{
		Reporter.log("Compose", true);
	}
	@Test(dependsOnMethods = "trash")
	public void setitems()
	{
		Reporter.log("Setitems", true);
		Assert.fail();
	}
	@Test(enabled = true)
	public void trash() {
		Reporter.log("trash",true);
	}
	
}
