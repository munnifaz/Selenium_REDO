package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.telerik.com/contact");
		
		WebElement selection = driver.findElement(By.name("DropdownListFieldController_0"));
		Select options = new Select(selection);
		options.selectByValue("Account activation");
			
		WebElement productIntrest = driver.findElement(By.id("Dropdown-2"));	
		Select optionsproduct = new Select(productIntrest);		
		optionsproduct.selectByValue("UI for WinForms");
		
		WebElement country = driver.findElement(By.className("js-country-field"));
		Select countryoption = new Select(country);
		countryoption.selectByValue("India");
		
		
		
	}

}
