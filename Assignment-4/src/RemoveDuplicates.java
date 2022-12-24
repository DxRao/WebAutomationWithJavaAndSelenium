// Assignment-4: Program-3

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		// Declaring LIst reference variable along with instantiation of ArrayList Object
		
		List<String> l1 = new ArrayList<>();
		
		// Adding elements to the object 
		
		l1.add("Java");
		l1.add("TestNG");
		l1.add("Maven");
		l1.add("Java");
		
		
		// Declaring Set reference variable along with new LinkedHashset Object
		
		Set<String>s1 = new LinkedHashSet<>();
		
		// Adding elements of List l1 to the empty LinkedHashSet object
		
		s1.addAll(l1);		
		
		 // Printing out elements from the LinkedHashSet in the same order as they were inserted.
		
		for(String  str : s1) {
		
			System.out.print(str + ", ");
		
		}
	}
}
