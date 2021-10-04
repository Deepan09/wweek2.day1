package week2.day1;

import java.sql.DriverPropertyInfo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
c
//driver.close();
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();
driver.findElementByLinkText("CRM/SFA").click();
 String title2 = driver.getTitle();
 System.out.println(title2);
driver.findElementByLinkText("Leads").click();
driver.findElementByLinkText("Create Lead").click();
driver.findElementById("createLeadForm_companyName").sendKeys("Oracle");
driver.findElementById("createLeadForm_firstName").sendKeys("Kanishka");
driver.findElementById("createLeadForm_lastName").sendKeys("Chakravarthy");
driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
/* ************size of dropdowns************  */
WebElement sourceSize = driver.findElementById("createLeadForm_dataSourceId");
Select drop1 =new Select(sourceSize);
int sizeSource = drop1.getOptions().size();
System.out.println("the size of source dropdown is :  " +sizeSource);
WebElement marketSize = driver.findElementById("createLeadForm_marketingCampaignId");
Select drop2 =new Select(marketSize);
int sizeMarket = drop2.getOptions().size();
System.out.println("the size of market dropdown is :  " +sizeMarket);
WebElement industrySize = driver.findElementById("createLeadForm_industryEnumId");
Select drop3 =new Select(industrySize);
int sizeIndustry = drop3.getOptions().size();
System.out.println("the size industry dropdown is :  " +sizeIndustry);
WebElement ownerSize = driver.findElementById("createLeadForm_ownershipEnumId");
Select drop4 =new Select(ownerSize);
int sizeowner = drop4.getOptions().size();
System.out.println("the size of ownership dropdown is :  " +sizeowner);
WebElement currencySize = driver.findElementById("createLeadForm_currencyUomId");
Select drop5 =new Select(currencySize);
int sizecurrrency= drop5.getOptions().size();
System.out.println("the size of preferred currency dropdown is :  " + sizecurrrency);
WebElement stateSize = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
Select drop6 =new Select(stateSize);
int sizeState= drop6.getOptions().size();
System.out.println("the size of STATES dropdown is :  " + sizeState);
WebElement countrySize = driver.findElementById("createLeadForm_generalCountryGeoId");
Select drop7 =new Select(countrySize);
int sizeCountry= drop7.getOptions().size();
System.out.println("the size of country dropdown is :  " + sizeCountry);
driver.findElementByClassName("smallSubmit").click();
String title3 = driver.getTitle();
System.out.println(title3);

	}

}
