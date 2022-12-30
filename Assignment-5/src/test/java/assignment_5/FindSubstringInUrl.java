// Assignment-5: Task-5

package assignment_5;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindSubstringInUrl {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();		
		
		//driver.get("http://www.google.com");
		
		//WebElement footer = driver.findElement(By.xpath("//div[@id='SIvCob']"));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		
		WebElement footer = driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']"));	
		
		List<WebElement> links = footer.findElements(By.tagName("a")); 			    
		 
        for(WebElement ele:links){
        	
        	// if(ele.getAttribute("href").contains("gu&source")) {
        	
        	if(ele.getAttribute("href").contains("youtube")){          
            	
            	break;            	
            }
            else {
            	
            	 System.out.println(ele.getAttribute("href"));
            		
            	}
            	
          driver.close();	
    	}	
    }
}
            
        
		
