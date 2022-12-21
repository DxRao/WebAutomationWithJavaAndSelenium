import java.util.Scanner;
	// Task-1
public class Trainer { // Trainer class creation
	
	// Instance variables
	String name;
	String department;
	String email;
	int id;
	
	public Trainer() {} //default constructor		
	  
	public Trainer(String name, String department, String email, int id) { //Overloaded Constructor
		
		this.name = name;
		this.department = department;
		this.email = email;
		this.id = id;
		
	}
	
	public void teaches() {
		
		if(id == 1) {
		System.out.println("Trainer 1 Mukesh teaches Selenium");
		}
		
		else if(id == 2){
			System.out.println("Trainer 2 Hitesh teaches Web Development");
		}
		
		else if (id == 3){
			System.out.println("Trainer 3 Mukesh teaches DevOps");
		}
	}// end of teaches() method
	
	public static void main(String[] args) {
		
		// Creation of various Trainer Objects through Constructor invocation and initializing the instance variables.
		Trainer trainer1 = new Trainer("Mukesh", "Selenium", "mukesh@gmail.com", 1);
		Trainer trainer2 = new Trainer("Hitesh", "Dev", "mukesh@gmail.com", 2);
		Trainer trainer3 = new Trainer("Mukesh", "DevOps", "mukesh@gmail.com", 3);
		
		// teaches() method calling through different objects to display desired output on console.
		trainer1.teaches();
		trainer2.teaches();
		trainer3.teaches();
		
		// Task-2:
		
		// Creation of 2-D Trainer Array to store various Trainers information.		
		String[][] trainer = new String[3][4];		
				
		//Trainer1 info stored in trainer Array
		trainer[0][0] = "Mukesh";
		trainer[0][1] = "Selenium";
		trainer[0][2] = "mukesh@gmail.com";
		trainer[0][3] = "1";
		
		//Trainer2 info stored in trainer Array
		trainer[1][0] = "Hitesh";
		trainer[1][1] = "Dev";
		trainer[1][2] = "mukesh@gmail.com";
		trainer[1][3] = "2";
		
		//Trainer3 info stored in trainer Array
		trainer[2][0] = "Mukesh";
		trainer[2][1] = "DevOps";
		trainer[2][2] = "mukesh@gmail.com";
		trainer[2][3] = "3";
		
		//Task-3: Students Info
		
		// Creation of Scanner Object to take input from key board.		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter number of Students: ");
		
		int n = scan.nextInt();		
		
		// Defining size of 2-D array dynamically with the help of users input.
		String[][] student = new String[n][5];
		
		for(int i = 0; i < n; i++) {
			for(int j =0; j < 1; j++) {	
			
				// Entering student name, email, phone, address, status info into trainer 2-D array.
				
				System.out.println("Please enter student name: ");
				student[i][j] = scan.next();
				
				System.out.println("Please enter student email: ");
				student[i][j+1] = scan.next();
				
				System.out.println("Please enter student phone number: ");
				student[i][j+2] = scan.next();
				
				System.out.println("Please enter student address: ");
				student[i][j+3] = scan.next();
				
				System.out.println("Please enter student status (Active or In Active): ");
				student[i][j+4] = scan.next();
				
			} // end of j
			
		} // end of i
		
		// Retrieving the information of a given student as requested by the user
		System.out.println("Please enter the student number for information retrieval: ");
		
		int num = scan.nextInt();		
		
		//	Printing out all the information pertaining to a given student as requested by user
		System.out.print("Student number:" + num + " Name, E-mail, Phone Number, Address, and Status are: ");
			
		for(int j = 0; j < 5; j++) {				
				
			System.out.print( student[num][j] + ", ");			
				
		}// end of j		
		
	}//end of main	

} // end of class
