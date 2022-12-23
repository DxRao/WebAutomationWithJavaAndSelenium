// Assignment-4: Program-2

import java.util.*;

public class FindElement {

	public static void main(String[] args) {
		
		// Creation of ArrayList object and declaration of its List type reference variable
		
		List<String> l1 = new ArrayList<>();
		
		// Adding string values to the object 
		
		l1.add("Git");
		l1.add("Github");
		l1.add("GitLab");
		l1.add("GitBash");
		l1.add("Selenium");
		l1.add("Java");
		l1.add("Maven");
		
		
		// Adding all the elements in the List l1 having substring 'Git' in them to the new empty list l2.
		
		List<String> l2 = new ArrayList<>();
			
		for(String str: l1) {
			
			if(str.contains("Git")) {
			
				l2.add(str);			
			}
		}
		
		// Printing out all pruned List elements having 'Git' substring in them.
		
		for(String str: l2) {		
			
			System.out.print(str + ", ");
			
		}
	}
}

