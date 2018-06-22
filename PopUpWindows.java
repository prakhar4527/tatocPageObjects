import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopUpWindows
{
	WebDriver driver;
	public PopUpWindows(WebDriver driver)
	{
		this.driver=driver;
	}
	public void checkProceedAfterSubmittingName() 
	{
		WebElement heading=driver.findElement(By.tagName("h1"));
		String s1=heading.getText();
		WebElement launch=driver.findElement(By.xpath("//*[text()[contains(.,'Launch Popup Window')]]"));
		launch.click();
		ArrayList windowsList =new ArrayList(driver.getWindowHandles());
		String window1= ((String)windowsList.get(1));
		driver.switchTo().window(window1);
		driver.findElement(By.id("name")).sendKeys("Prakhar");
		driver.findElement(By.id("submit")).click();
		String window0= ((String)windowsList.get(0));
		driver.switchTo().window(window0);
		driver.findElement(By.linkText("Proceed")).click();
	}
}
