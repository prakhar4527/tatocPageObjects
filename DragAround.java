import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAround
{
	WebDriver driver;
	public DragAround(WebDriver driver)
	{
		this.driver=driver;
	}
	public void checkProceedAfterDragAndDrop() 
	{
		WebElement drag=driver.findElement(By.id("dragbox"));
		WebElement drop=driver.findElement(By.id("dropbox"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(drag, drop).perform();
		WebElement pro1=driver.findElement(By.xpath("//*[text()[contains(.,'Proceed')]]"));
		pro1.click();
	}
}
