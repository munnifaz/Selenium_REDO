package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_HA {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://en-gb.facebook.com/ ");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("MM");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Shaik");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("xdfnsd@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("dsfsdf");
		
		WebElement Dateelement = driver.findElement(By.id("day"));  //birthday Date selection
		Select Dateoptions= new Select(Dateelement);
		Dateoptions.selectByValue("15");
		
		WebElement Monthelement = driver.findElement(By.id("month"));  //birthday Month selection
		Select Monthoptions= new Select(Monthelement);
		Monthoptions.selectByValue("3");
		
		WebElement Yearelement = driver.findElement(By.id("year"));  //birthday Year selection
		Select yearoptions= new Select(Yearelement);
		yearoptions.selectByValue("1992");
		
		driver.findElement(By.xpath("//input[@id='sex' and @value='1']")).click(); //radio Button
		
		
		
		
		
		
		driver.close();
		
	}

}
