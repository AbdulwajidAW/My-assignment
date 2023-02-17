package Selenium.assesment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Abdul");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("wajid");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abdulwaji000@gamil.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("abdulwaji000@gamil.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Wajid@000");
		
		WebElement day = driver.findElement(By.id("day"));
		Select selectDay=new Select(day);
		selectDay.selectByValue("20");
		
		WebElement month = driver.findElement(By.id("month"));
		Select selectMonth=new Select(month);
		selectMonth.selectByVisibleText("Oct");
		
		WebElement year = driver.findElement(By.id("year"));
		Select selectYear=new Select(year);
		selectYear.selectByValue("2000");
		
		
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();		
		
		driver.close();
		
		

}
}