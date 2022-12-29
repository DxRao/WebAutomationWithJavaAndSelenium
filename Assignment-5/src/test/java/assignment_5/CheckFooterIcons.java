// Assignment-5: Task-3
package assignment_5;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckFooterIcons {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		
		WebElement footer = driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']"));
	    
		int links = footer.findElements(By.tagName("a")).size(); 
	    
		if(links >= 4) {
			
		System.out.println("Number of Social Media Icons present in Footer are: " + links); 
		
		}	   
		
		driver.close();	
	}	
}
