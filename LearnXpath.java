package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		;
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@class='inputLogin']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("IBM");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Kanishka");
		driver.findElementByXPath("//input[contains(@id,'createLeadForm_lastName')]").sendKeys("Chakravarthy");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
		driver.findElementByXPath("//input[@name='submitButton']").click();
	}

}
