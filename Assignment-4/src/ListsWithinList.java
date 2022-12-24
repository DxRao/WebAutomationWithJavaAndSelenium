// Assignment-4: Program-5

import java.util.*;

public class ListsWithinList {

	public static void main(String[] args) {
		
		// Creation of ArrayList object and its List type reference variable
		
		List<Integer> l1 = new ArrayList<>();
		
		// Adding values to the object
		
		l1.add(11);
		l1.add(22);
		l1.add(33);
		
		// Creation of ArrayList object and its List type reference variable
		
		List<Integer> l2 = new ArrayList<>();
				
		// Adding values to the object
		
		l2.add(9);
		l2.add(19);
		l2.add(29);
				
		// Creation of ArrayList object and its List type reference variable
				
		List<Integer> l3 = new ArrayList<>();
				
		// Adding values to the object
		
		l3.add(7);
		l3.add(17);
		l3.add(27);
				
		List<List<Integer>> l4 = new ArrayList<>();
		
		// Adding values to the object
				
		l4.add(l1);
		l4.add(l2);
		l4.add(l3);
		
		
		// Printing out the  added lists(l1, l2, l3) within the List l4.		
		
		for(int i = 0; i < l4.size(); i++){						

			System.out.println("Lists added to the List l4 are: " + l4.get(i));				
		}
	}
}
