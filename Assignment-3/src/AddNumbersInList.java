// Assignment-3: Program-4
import java.util.*;

public class AddNumbersInList {

	public static void main(String[] args) {
		
		// Creation of ArrayList object and its List type reference variable
		List<Integer> l1 = new ArrayList<>();
		
		// Adding values to the object  
		l1.add(10);
		l1.add(20);
		l1.add(40);
		l1.add(50);
		l1.add(30);
		
		// Printing out the sum of numbers added to the List.		
		
		int sum =0;
		
			for(int i = 0; i < l1.size(); i++){
				
				sum = sum + l1.get(i);			
		}			

		System.out.print("Sum of numbers added to the List is: " + sum);

	}

}
