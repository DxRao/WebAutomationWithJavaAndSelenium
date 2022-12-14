
public class FindNumber {

	public static void main(String[] args) {
		
		int[] arr = {12, 34, 66, 85, 900};
		
		System.out.print("Given Numbers in input before encountering the number 85 are: ");
		
		for(int ary: arr) {			
			
			if(ary != 85) {
				
				System.out.print(ary + " ");
			}
			
			else{
					
				break;				
			}			
		}
	}
}
