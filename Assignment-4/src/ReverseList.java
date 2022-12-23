// Assignment-4: Program-1

import java.util.*;

public class ReverseList {

	public static void main(String[] args) {
		
		// Declaring LIst reference variable along with instantiation of ArrayList Object
		
		List<String> l1 = new ArrayList<>();
		
		// Adding elements to the object 
		
		l1.add("Java");
		l1.add("Selenium");
		l1.add("TestNG");
		l1.add("Git");
		l1.add("Github");
		
		// Creating empty list
		
		List<String>l2 = new ArrayList<>();
		
		// Adding elements in reverse fashion to the l2 empty list
		
		for(int i = l1.size(); i > 0; i--) {
			
			l2.add(l1.get(i-1));
			
		}
		 // Printing out elements from the reversed l2 list elements.
		
		for(int i = 0; i < l2.size(); i++) {
		
			System.out.print(l2.get(i) + ", ");
		
		}
	}
}
