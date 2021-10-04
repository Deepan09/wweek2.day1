package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	private static int sizedrop3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();;
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByName("UserFirstName").sendKeys("kanishka");
		driver.findElementByName("UserLastName").sendKeys("chakravarthy");
		driver.findElementByName("UserEmail").sendKeys("sample@email.com");
		WebElement jobTitle = driver.findElementByName("UserTitle");
		Select drop1 =new Select(jobTitle);
		drop1.selectByValue("Customer_Service_Manager_AP");
		driver.findElementByName("CompanyName").sendKeys("oracle");
		WebElement employeeNo = driver.findElementByName("CompanyEmployees");
		Select drop2 =new Select(employeeNo);
		int sizeOfEmp = drop2.getOptions().size();
		System.out.println(" the sixe of employees dropdown is : " +sizeOfEmp);
		drop2.selectByValue("250");
		driver.findElementByName("UserPhone").sendKeys("1234567890");
		WebElement compCountry = driver.findElementByName("CompanyCountry");
		Select drop3 =new Select(compCountry);
		sizedrop3 = drop3.getOptions().size();
		System.out.println("the countries dropdown size is : "+sizedrop3);
		drop3.selectByValue("India");
		driver.findElementByClassName("checkbox-ui").click();
	}

}

