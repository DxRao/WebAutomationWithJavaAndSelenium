//Task-3: Program storing and retrieving of Students Information

import java.util.Scanner; 

public class Students {
	
	// Instance variables
	String name;
	String email;
	String phoneNumber;
	String address;
	boolean status;

	public static void main(String[] args) {			
		
		// Creation of Scanner Object to take input from key board.		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Please enter number of Students: ");
				
		int n = scan.nextInt();		
				
		// Declaring Students array type and size dynamically with the help of users input.
		Students[] obj = new Students[n];
				
		for(int i = 0; i < n; i++) {
			
			//  Creating n-number of Students' Objects dynamically
			obj[i] = new Students();
					
			// Entering student name, email, phone, address, status info into each Students' Object.
						
			System.out.println("Please enter student name: ");
			obj[i].name = scan.next();
						
			System.out.println("Please enter student email: ");
			obj[i].email = scan.next();
						
			System.out.println("Please enter student phone number: ");
			obj[i].phoneNumber = scan.next();
						
			System.out.println("Please enter student address: ");
			obj[i].address = scan.next();
						
			System.out.println("Please enter student status (true or false): ");
			obj[i].status = scan.nextBoolean();					
					
		} // end of i
				
			// Retrieving the information of a given student as requested by the user
		System.out.println("Please enter the student number for information retrieval: ");
				
		int num = scan.nextInt();		
				
		//	Printing out all the information pertaining to a given student as requested by user
		System.out.println("Student number " + num + "'s Info: Name: " + obj[num].name + ", " + "E-mail: " + obj[num].email + ", " + "Phone Number: " + obj[num].phoneNumber + ", " + "Address: " + obj[num].address + ", " + "and Status: " + obj[num].status);
	
	}
}
