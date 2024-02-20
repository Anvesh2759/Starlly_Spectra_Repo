package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Script_01 
{
	@Test
	public void script_01()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://spectra.starlly.in/signin");
		driver.findElement(By.name("email")).sendKeys("nikith@starlly.in");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath(".//button[text()='Login']")).click();
	}

}
