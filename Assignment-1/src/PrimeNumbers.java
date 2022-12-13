
public class PrimeNumbers {

	public static void main(String[] args) {
		
		int counter = 0;
		
		for(int i = 1; i <= 1000; i++) {
			for(int j = 1; j <= i; j++) {
			
				if(i % j == 0) {
					
					counter++;					
				}			
			}// end of j
			
			if(counter == 2) {
				
				System.out.print(i + " ");				
			}
			
			counter = 0;
			
		}//end of  i
	}
}
