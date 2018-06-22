package qainfotech.tatocPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class welcomePage
{
	WebDriver driver;
	public welcomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public GridGate OnClickBasicCourse()
	{
		clickBasic();
		return new GridGate(driver);
	}
	public void clickBasic()
	{
		driver.findElement(By.linkText("Basic Course")).click();
	}
}
