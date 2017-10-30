package MavenProject.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
	@BeforeMethod
	void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Raja\\WebDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("widows opened Successfully");
	}
@Test
void firstMethod()
{
	System.out.println("first method executed");
}
}
