package week3.Day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		//https://peter.sh/experiments/chromium-command-line-switches/ --disable-notifications
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-success']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Munniii");
		
		alert.accept();
		Thread.sleep(2000);
		
		String text = driver.findElement(By.id("confirm_result")).getText();
		
		System.out.println(text);
		
		if(text.contains("Munniii")) {
			
			System.out.println("Entered name is verified");
		}
		else {
			System.out.println("The entered name is different");
		}
		
		driver.close();
		

	}

}
