// Assignment-3: Program-7
import java.util.*;

public class OperationsOnList {

	public static void main(String[] args) {		
		
				// Creation of ArrayList object and its List type reference variable
		List<Integer> l1 = new ArrayList<>();
				
				// Adding values to the object   
		l1.add(33);
		l1.add(44);
		l1.add(55);
		l1.add(66);
		l1.add(77);
		l1.add(88);
		
				// Remove second element from list using index
		
		l1.remove(1);
		
		System.out.println(l1);		
		
				// Remove second element from list using value
		
		l1.remove(Integer.valueOf(55));
		
		System.out.println(l1);		
		
				// Add 90 at index 3
		
		l1.add(3, 90);
		
		System.out.println(l1);		
		
				// Get the length of list
		
		System.out.println("Length of List l1 is: " + l1.size());	
		
		
				// Print all values from list using any values		
		
		System.out.print("Values in the List which contains 88 as element are: ");		
		
		for(int i = 0; i < l1.size(); i++){
			
			if(l1.contains(88))
				
				System.out.print(l1.get(i) + " ");							
		}
		
				// Convert List l1 into Array arr
		
		int[] arr = new int[l1.size()];
		
		for(int i = 0; i < l1.size(); i++){
			
			arr[i] = l1.get(i);			
											
		}
		
				// Printing out all the elements in the converted Array arr
		
		System.out.println();
		
		System.out.print("Elements in Array arr are: ");
		
		for(int i = 0; i < arr.length; i++) {
		
			System.out.print(arr[i] + " ");
		
		}
	}
}
		
