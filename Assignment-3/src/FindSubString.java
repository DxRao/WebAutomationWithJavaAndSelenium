// Assignment-3: Program-7
import java.util.*;

public class FindSubString {

	public static void main(String[] args) {
		
		// Creation of ArrayList object and its List type reference variable
		
		List<String> l1 = new ArrayList<>();
		
		// Adding string values to the object 
		
		l1.add("Web Automation");
		l1.add("API Automation");
		l1.add("Mobile Automation");
		
		
		// Printing true or false depending on whether List l1 contains 'Mobile' substring in any element.		
			
		for(String str: l1) {
			
			if(str.contains("Mobile")) {
			
				System.out.print(true + " ");			
			}			
			else {
				
				System.out.print(false + " ");				
			}
		}		
	}
}
