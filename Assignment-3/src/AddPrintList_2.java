// Assignment-3: Program-2
import java.util.*;

public class AddPrintList_2 {

	public static void main(String[] args) {
		
		// Creation of ArrayList object and its List type reference variable
		List<Integer> l1 = new ArrayList<>();
		
		// Adding values to the object
		l1.add(10);
		l1.add(20);
		l1.add(40);
		l1.add(50);
		l1.add(30);
		
		// Printing out added values to the List in the same order they are inserted.
		
		//System.out.print("Elements added in the List in the order of insertion are: " + l1);
		System.out.print("Elements added in the List in the order of insertion are: ");
		
		for(Integer val : l1) {
			
			System.out.print(val + " ");
			
		}
	}

}
