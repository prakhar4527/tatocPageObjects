package qainfotech.tatocPageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class welcomePage
{
	WebDriver driver;
	public welcomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public GridGate OnClickBasicCourse()
	{
		driver.findElement(By.linkText("Basic Course")).click();
		WebElement e= driver.findElement(By.tagName("title"));
		/*String expectedUrl = "http://10.0.1.86/tatoc/basic/grid/gate";
		Assert.assertEquals(expectedUrl, driver.getCurrentUrl(), "Didn't navigate to correct webpage");*/
		String title = e.getText();
		assertEquals("Grid Gate - Basic Course - T.A.T.O.C", driver.getTitle());

		return new GridGate(driver);
	}
}
