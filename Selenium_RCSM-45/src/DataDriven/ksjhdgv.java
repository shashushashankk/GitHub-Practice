package DataDriven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ksjhdgv {
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass");
	}
	@Test
	public void test()
	{
		System.out.println("Test");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("AfterClass");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("AfterTest");
	}
	@AfterSuite
	public void Aftersuit() {
		System.out.println("After Suit");
	}
}
