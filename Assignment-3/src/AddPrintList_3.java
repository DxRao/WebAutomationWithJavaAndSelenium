// Assignment-3: Program-3
import java.util.*;

public class AddPrintList_3 {

	public static void main(String[] args) {
		
		// Creation of ArrayList object and its List type reference variable
		List<Integer> l1 = new ArrayList<>();
		
		// Adding values to the object
		l1.add(10);
		l1.add(20);
		l1.add(40);
		l1.add(50);
		l1.add(30);
		
		Iterator<Integer> iter = l1.iterator();
		
		// Printing out added values to the List in the same order they are inserted.		
		System.out.print("Elements added in the List in the order of insertion are: ");
		
		while(iter.hasNext()) {
			
			System.out.print(iter.next() + " ");
			
		}		
	}
}
