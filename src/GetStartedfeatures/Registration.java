package GetStartedfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Registration {

	public static void main(String[] args) {
		System.setProperty("webdrive.gecko.driver", "C:\\Software\\selenium.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.opencart.com/");		//Page is loading continuously after clicked on register button so can directly jump on to the registration page

		driver.get("https://www.opencart.com/index.php?route=account/register"); // Not open the registration page due to security  connection issue

		driver.findElement(By.xpath("//a[@class=\"btn btn-black navbar-btn\"]")).click();
		
		
	}

}
