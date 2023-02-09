package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//verify the page
		String text=driver.findElement(By.tagName("h2")).getText();
		//click on crmsfa hyperlink
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abdul Wajid");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Abdul");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Software Tester");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("7500000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1234");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I am a software tester");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("nil");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Wajid");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer Science");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("25");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("AW");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abdulwaji000@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9551575281");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Abdul Wahab Saharani");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Sanjay Gandhi Nagar");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600081");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Saidha Banu");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Tondiarpet");
		
	
	}

}
