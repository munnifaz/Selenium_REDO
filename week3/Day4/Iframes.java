package week3.Day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		WebElement element = driver.findElement(By.id("iframeResult"));
		
		driver.switchTo().frame(element);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();	
		
		System.out.println(text);
		
		
		if(text.contains("pressed OK")) {
			
			System.out.println("Text is verified");
		}
		else {
			System.out.println("Text is different");
		}
		
		driver.close();
		
		
		}

}
