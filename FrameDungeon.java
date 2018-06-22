package qainfotech.tatocPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameDungeon 
{
	WebDriver driver;
	public FrameDungeon(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickGreen()
	{
		driver.findElement(By.className("greenbox")).click();
	}
	/*public boolean checkBox1IsEqualToBox2()
	{
		driver.switchTo().frame("main");
		WebElement b1=driver.findElement(By.xpath("//*[text()[contains(.,'Box 1')]]"));
		String s1 = b1.getAttribute("class");
		driver.switchTo().frame("child");
		WebElement b2=driver.findElement(By.xpath("//*[text()[contains(.,'Box 2')]]"));
		String s2 = b2.getAttribute("class");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("main");
		if(s1.equals(s2))
		{
			
			return true;
		}
		else
		{
			
			return false;
		}
	}*/
	public void RepaintBox2()
	{
		driver.switchTo().frame("main");
		WebElement b1=driver.findElement(By.xpath("//*[text()[contains(.,'Box 1')]]"));
		int flag=0;
		while(flag==0)
		{
			String s1 = b1.getAttribute("class");
			driver.switchTo().frame("child");
			WebElement b2=driver.findElement(By.xpath("//*[text()[contains(.,'Box 2')]]"));
			String s2 = b2.getAttribute("class");
			driver.switchTo().defaultContent();
			driver.switchTo().frame("main");
			if(s1.equals(s2))
			{
				flag=1;
				WebElement pro=driver.findElement(By.xpath("//*[text()[contains(.,'Proceed')]]"));
				pro.click();
			}
			else
			{
				WebElement re=driver.findElement(By.xpath("//*[text()[contains(.,'Repaint Box 2')]]"));
				re.click();
			}
		}
		driver.switchTo().defaultContent();
	}
}
