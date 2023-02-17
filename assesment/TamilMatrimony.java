package Selenium.assesment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement profile=driver.findElement(By.id("REGISTERED_BY"));
		Select selectProfile=new Select(profile);
		selectProfile.selectByVisibleText("Myself");
		driver.findElement(By.id("NAME")).sendKeys("Abdul Wajid");
		driver.findElement(By.xpath("//input[@class='hp-gender']")).click();		
		WebElement date=driver.findElement(By.id("DOBDAY"));
		Select selectDate=new Select(date);
		selectDate.selectByValue("20");
		
		WebElement month=driver.findElement(By.id("DOBMONTH"));
		Select selectMonth=new Select(month);
		selectMonth.selectByVisibleText("Oct");
		
		WebElement year=driver.findElement(By.id("DOBYEAR"));
		Select selectYear=new Select(year);
		selectYear.selectByValue("2000");
		
		WebElement religion=driver.findElement(By.id("RELIGION"));
		Select selectReligion=new Select(religion);
		selectReligion.selectByVisibleText("Muslim - Others");
		
		WebElement motherTongue=driver.findElement(By.id("MOTHERTONGUE"));
		Select selectMotherTongue=new Select(motherTongue);
		selectMotherTongue.selectByVisibleText("Tamil");
		
		WebElement caste=driver.findElement(By.id("CASTE_NORMAL"));
		Select selectCaste=new Select(caste);
		selectCaste.selectByValue("409");
		
		WebElement country=driver.findElement(By.id("COUNTRY"));
		Select selectCountry=new Select(country);
		selectCountry.selectByVisibleText("India");
		
		driver.findElement(By.id("MOBILENO")).sendKeys("9551575281");
		driver.findElement(By.id("EMAIL")).sendKeys("abdulwaji000@gmail.com");
		driver.findElement(By.xpath("//input[@name='PASSWD1']")).sendKeys("Wajid@000");
		
		
		
	}

}
