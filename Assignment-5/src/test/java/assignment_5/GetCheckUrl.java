// Assignment-5: Task-1
package assignment_5;

import org.openqa.selenium.WebDriver; 

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCheckUrl {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();	 	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String title = driver.getTitle();		 
		
		String url = driver.getCurrentUrl();
		
		String last = url.substring(url.lastIndexOf("/") + 1);		
		
		if(last.equals("login")) {
			
			System.out.println("Yes ... URL ends with the 'login' string");			
		}
		else {
			
			System.out.println("No ... URL does not end with the 'login' string");			
		}
		
		if(url.contains("demo")) {
			
			System.out.println("Yes ... URL contains 'demo' string in it");			
		}
		else {
			
			System.out.println("No ... URL does not contain 'demo' string in it");			
		}
		
		if(title.contains("HRM")) {
			
			System.out.println("Yes ... Title contains 'HRM' string in it");			
		}
		else {
			
			System.out.println("No ... Title doesn't contain 'HRM' string in it");			
		}		
		
		driver.close();	
	}
	
}

