package TYSelenium;

import org.testng.annotations.DataProvider;

public class LoginData {
	@DataProvider(name = "login data", parallel = true)
	public Object[][] loginData() {
		Object[][] data=new Object[2][2];
		data[0][0]="shashankkshetty2000@gmail.com";
		data[0][1]="Shashu@123";
		data[1][0]="sachinsy@gmail.com";
		data[1][1]="sachin123";
		return data;
	}

}
