package GetStartedfeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdrive.gecko.driver", "C:\\Software\\selenium.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.opencart.com/");

        
	}


	}


