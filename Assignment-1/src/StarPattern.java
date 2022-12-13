
public class StarPattern {

	public static void main(String[] args) {
		
		int n = 6;
		
		for(int i = 0; i < n; i++) { 
			for(int j = 0; j <= i; j++){
				
				if(  i-j <= n){
		
				System.out.print("*");
				
				}
				else {
					
					System.out.print(" ");
				}
			}//end of j for loop		
		
		System.out.println();
		
		}// end of i for loop
		
	}

}
