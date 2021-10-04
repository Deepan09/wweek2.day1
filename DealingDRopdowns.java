package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DealingDRopdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();;
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement findElement = driver.findElement(By.id("dropdown1"));
		Select drop1 = new Select(findElement);
		drop1.selectByIndex(1);
		WebElement findElementByName = driver.findElementByName("dropdown2");
		Select drop2 = new Select(findElementByName);
		drop2.selectByVisibleText("Appium");
		WebElement findElement3 = driver.findElement(By.id("dropdown3"));
		Select drop3 = new Select(findElement3);
		drop3.selectByValue("4");
		WebElement findElementByClassName = driver.findElementByClassName("dropdown");
		Select dropSize=new Select(findElementByClassName);
		int sizeDrop4 = dropSize.getOptions().size();
		System.out.println("the sixe of dropdown 4 is : " +sizeDrop4);
		
		
		
}
}