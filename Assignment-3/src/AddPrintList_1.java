// Assignment-3: Program-1
import java.util.*;

public class AddPrintList_1 {

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
		
		System.out.print("Elements added to the List in the order of insertion are: ");
		
			for(int i = 0; i < l1.size(); i++){
			
			System.out.print(l1.get(i) + " ");
			
		}

	}

}
