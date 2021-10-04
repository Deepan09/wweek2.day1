package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();;
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("kanishka");
		driver.findElement(By.name("lastname")).sendKeys("chakravarthy");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Login@123");
		WebElement birthDay = driver.findElementById("day");
		Select drop1 = new Select(birthDay);
		drop1.selectByValue("1");
		WebElement birthMonth = driver.findElementById("month");
		Select drop2 = new Select(birthMonth);
		drop2.selectByValue("8");
		WebElement birthYear = driver.findElementById("year");
		Select drop3 = new Select(birthYear);
		drop3.selectByValue("2019");
		driver.findElementByClassName("_58mt").click();
		
	}

}

