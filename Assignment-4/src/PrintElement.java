// Assignment-4: Program-4

import java.util.*;

public class PrintElement {

	public static void main(String[] args) {
		
		// Creation of ArrayList object and its List type reference variable
		
		List<Integer> l1 = new ArrayList<>();
		
		// Adding values to the object 
		
		l1.add(10);
		l1.add(45);
		l1.add(90);
		l1.add(45);
		l1.add(23);
		l1.add(90);
		l1.add(44);
		
		// Printing out element 2 and second last element in the given list l1	
		
		System.out.print("Element 2nd is: " + l1.get(1) + " " + "\nElement 2nd last is: " + l1.get(5) );			
	}
}
