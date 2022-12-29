// Assignment-5: Task-2
package assignment_5;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckLogo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://www.amazon.in");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");			
		
		List<WebElement> links = driver.findElements(By.tagName("img"));	    
		 
	        for(WebElement ele:links){
	        	
	            System.out.println(ele.getAttribute("src"));
	        }	    		
		
		driver.close();	
	}	
}