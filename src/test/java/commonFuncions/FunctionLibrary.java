package commonFuncions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.PropertyFileUtil;
/*Project Name: Stock Accounting
 * Tester: Narendra
 * Created Date: 3-3-2023
 * Module Name: All Modules
 */

public class FunctionLibrary {
	public static WebDriver driver;
	
	//Methods For Start Browser
	public static WebDriver startBrowser()throws Throwable {
		if(PropertyFileUtil.getValueForKey("Browser")).equalsIgnoreCase("chrome"){
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(PropertyFileUtil.getValueForKey("Browser")).
	}

}
