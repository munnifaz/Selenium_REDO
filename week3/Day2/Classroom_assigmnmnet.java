package week3.Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classroom_assigmnmnet {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("Shoes",Keys.ENTER);
		
		List<WebElement> allPrice=driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		
		int listSize=allPrice.size();
		System.out.println(listSize);
		
		//empty list
		
		List<Integer>getprice=new ArrayList<Integer>();
		
		for(WebElement i:allPrice) {
			
			String text=i.getText();
			
			String replaceAll1 = text.replaceAll("[Rs. , ]", "");
			//System.out.println(replaceAll1);

			int parseInt = Integer.parseInt(replaceAll1);
			System.out.println(parseInt);

			//add price inside list
			getprice.add(parseInt);
		}
		
		System.out.println("List Value :"+getprice);
		
		
		//list into set
		Set<Integer> unq=new TreeSet<Integer>(getprice);
		int setSize = unq.size();
		System.out.println(setSize);

		System.out.println(unq);
		 List<Integer> list= new ArrayList<Integer>(unq); 
		    
	        for(int ele : list){ 
	            System.out.println(ele+" "); 
	        } 
	            
	        // getting the element at index 2 
	          System.out.println("The first shoe price is:"+list.get(0)); 
	  
		

		if(listSize==setSize) {
			System.out.println("No duplicate prices");
		}else {
			System.out.println("duplicate prices is there");
		}
		
		driver.close();
	}

}
