package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass 
{
	public static WebDriver driver;
	public static Properties prop;


	public BaseClass() 
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream("./src/main/java/config/configurationData.properties");
			prop=new Properties();
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void initialization() {

		String bName=prop.getProperty("BrowserName");

		if(bName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./src/test/java/resources/chromedriver.exe");  // set the broswer exe path
			driver=new ChromeDriver();
		}
		else if(bName.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "D:\\sel\\firefox.exe");  // set the broswer exe path
			driver=new FirefoxDriver();
		}
		else if(bName.equals("IE")) 
		{
			System.setProperty("webdriver.ie.driver", "D:\\sel\\ie.exe");  // set the broswer exe path
			driver=new InternetExplorerDriver();
		}
		else if(bName.equals("safari")) 
		{
			System.setProperty("webdriver.ie.driver", "D:\\sel\\safari.exe");  // set the broswer exe path
			driver=new SafariDriver();
		}
		else 
		{
			System.out.println("please give the browser name");
		}

		
	}
	
}
