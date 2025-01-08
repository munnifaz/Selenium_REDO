package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlearning {

		public static void main(String[] args) throws InterruptedException {
			
			 ChromeDriver driver=new ChromeDriver(); 

			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf.2023@gmail.com");
			
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Tuna@321");
			
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//a[text()='Find your account and log in.']")).click();
			
			
			

	}

}
