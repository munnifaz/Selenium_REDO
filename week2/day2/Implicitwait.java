package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) {

		
		 ChromeDriver driver=new ChromeDriver(); 

			driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
			/*
			 * driver.get("https://login.salesforce.com/?locale=in");
			 * 
			 * driver.findElement(By.xpath("//div[@id='username_container']//input")).
			 * sendKeys("dilip@testleaf.com");
			 * 
			 * driver.findElement(By.xpath(
			 * "//label[text()='Password']//following-sibling::input[1]")).sendKeys(
			 * "leaf@2024");
			 * 
			 * driver.findElement(By.xpath(
			 * "//label[text()='Password']//following-sibling::input[2]")).click();
			 * 
			 * driver.close();
			 */
			
			
			driver.get("https://www.amazon.in/");
			
			driver.findElement(By.xpath("//label[text()='Search Amazon.in']/following-sibling::input")).sendKeys("book",Keys.ENTER);
			
			String bookname = driver.findElement(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'][1]")).getText();
			
			System.out.println(bookname);
			
			String bookprice = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]")).getText();
			
			String bp = bookprice.replaceAll(",", "");
			
			int int1 = Integer.parseInt(bp		);
			
			System.out.println(int1);
	}

}
