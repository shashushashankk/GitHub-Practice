package _DemoWebShop_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import _DemoWebShop_Generics.BaseClass;


public class TestScript_2 extends BaseClass {
	String actual_res="The one day air shipping";
	@Test
	public  void ShoppingCart_Est_product() {
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Health Book",Keys.ENTER);
		driver.findElement(By.xpath("//a[.='Health Book']/../../div[3]/div[2]/input")).click();
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		WebElement Con_drp=driver.findElement(By.xpath("//select[@id='CountryId']"));
		Select sel=new Select(Con_drp);
		sel.selectByVisibleText("India");
		WebElement Sta_drp=driver.findElement(By.xpath("//select[@id='StateProvinceId']"));
		Select sel1=new Select(Sta_drp);
		sel1.selectByVisibleText("Other (Non US)");
		driver.findElement(By.xpath("//input[@id='ZipPostalCode']")).sendKeys("577179");
		driver.findElement(By.xpath("//input[@name='estimateshipping']")).click();
		WebElement info=driver.findElement(By.xpath("(//span[@class='option-description'])[2]"));
		String excp_res =info.getText();
		SoftAssert sas=new SoftAssert();
		sas.assertEquals(actual_res, excp_res);
		Reporter.log("Information is displaying",true);
		sas.assertAll();
	}
}
