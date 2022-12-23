// Assignment-3: Program-5
import java.util.*;

public class ArrayToList {

	public static void main(String[] args) {
		
		// Creation of Array and initializing values to it.
		
		int[] arr = {5, 15 , 25 , 35, 45, 55};
		
		// Creation of ArrayList object and its List type reference variable 
		
		List<Integer> l1 = new ArrayList<>();		
		
		// Adding values to the List l1 from the Array arr.	
		
			for(int i = 0; i < arr.length; i++){
				
				l1.add(arr[i]);			
		}
			
			System.out.println(l1);
	}
}
