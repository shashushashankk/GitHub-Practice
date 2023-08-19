/*
 * package Web_Shop;
 * 
 * import java.util.concurrent.TimeUnit;
 * 
 * import org.apache.batik.apps.rasterizer.Main; import org.openqa.selenium.By;
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import org.testng.Reporter; import
 * org.testng.annotations.AfterClass; import org.testng.annotations.AfterMethod;
 * import org.testng.annotations.BeforeClass; import
 * org.testng.annotations.BeforeMethod; import org.testng.annotations.Test;
 * 
 * public class BaseClass { public WebDriver driver;
 * 
 * @BeforeClass public void launchBrowsere() {
 * System.setProperty("webdriver.chrome.driver",
 * "./Softwares/chromedriver.exe"); driver =new ChromeDriver();
 * driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 * driver.get("https://demowebshop.tricentis.com/");
 * Reporter.log("url launched", true);
 * 
 * }
 * 
 * @BeforeMethod public void login() {
 * driver.findElement(By.xpath("//a[.='Log in']")).click();
 * driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(
 * "shashankkshetty2000@gmail.com");
 * driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shashu@123"
 * ); driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
 * driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click
 * (); //TestScript_4.main(driver); Reporter.log("Application logedin",true); }
 * 
 * @AfterMethod public void logout() {
 * driver.findElement(By.xpath("//a[.='Log out']")).click();
 * Reporter.log("Application Logedout", true); }
 * 
 * @AfterClass public void closeBrowser() { Reporter.log("Browser closed",
 * true); driver.quit(); } }
 */