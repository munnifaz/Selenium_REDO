package week2.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Marathon1 {

	public static void main(String[] args) {
		
		ChromeDriver dr=new ChromeDriver();
		
		dr.get("https://www.pvrcinemas.com/");
		
		dr.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		
		dr.findElement(By.xpath("(//input[contains(@class,'p-inputtext p-component')])[2]")).sendKeys("Chennai",Keys.ENTER);
		
		dr.findElement(By.xpath("//span[text()='Cinema']")).click();
		
		
		
		
		
	}

}
