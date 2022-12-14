
public class FindStringElement {

	public static void main(String[] args) {
		
		String[] arr = { "Java", "JavaScript", "Selenium", "Python", "Mukesh"};		
		
		System.out.print("Elements in the given String before encountering the Selenium element are: ");
		
		for(String ary :arr) {			
			
			if(ary.equals("Selenium")){
				
				break;
			}			
			else{
					
				System.out.print(ary + " ");				
			}			
		}
	}
}
