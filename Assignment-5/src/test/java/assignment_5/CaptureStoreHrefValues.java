//Assignment-5: Task-4
package assignment_5;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureStoreHrefValues {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();		
		
		driver.get("http://www.google.com");
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		
		//WebElement footer = driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']"));
		
		WebElement footer = driver.findElement(By.xpath("//div[@id='SIvCob']"));
		
		List<WebElement> links = footer.findElements(By.tagName("a")); 
	    		
		Map<String, String> map = new LinkedHashMap<String, String>();
		
		String[] arr = {"Facebook","Twitter","Youtube","Linkedin"};			
		 
	    for(WebElement ele:links){
	    	
	    	int i = 0;
	        	
	    	map.put(arr[i], ele.getAttribute("href"));
	        	
	        i++;        
	        
	     }
	    
	    for (Map.Entry<String, String> set : map.entrySet()) {
		    System.out.println(set.getKey() + " = " + set.getValue());
		}
		
		driver.close();	
	}	
}
