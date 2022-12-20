import java.util.Scanner;
	// Task-1
public class Trainer {
	
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
	
	public void canTeach() {
		
		if(id == 1) {
		System.out.println("Trainer 1 Mukesh teaches Selenium");
		}
		
		else if(id == 2){
			System.out.println("Trainer 2 Hitesh teaches Web Development");
		}
		
		else if (id == 3){
			System.out.println("Trainer 3 Mukesh teaches DevOps");
		}
	}// end of method
	
	public static void main(String[] args) {
		
		Trainer trainer1 = new Trainer("Mukesh", "Selenium", "mukesh@gmail.com", 1);
		Trainer trainer2 = new Trainer("Hitesh", "Dev", "mukesh@gmail.com", 2);
		Trainer trainer3 = new Trainer("Mukesh", "DevOps", "mukesh@gmail.com", 3);
		
		trainer1.canTeach();
		trainer2.canTeach();
		trainer3.canTeach();
		
		// Task-2:
		
		String[][] trainer = new String[3][4];		
				
		//Trainer1 info stored in an Array
		trainer[0][0] = "Mukesh";
		trainer[0][1] = "Selenium";
		trainer[0][2] = "mukesh@gmail.com";
		trainer[0][3] = "1";
		
		//Trainer2 info stored in an Array
		trainer[1][0] = "Hitesh";
		trainer[1][1] = "Dev";
		trainer[1][2] = "mukesh@gmail.com";
		trainer[1][3] = "2";
		
		//Trainer3 info stored in an Array
		trainer[2][0] = "Mukesh";
		trainer[2][1] = "DevOps";
		trainer[2][2] = "mukesh@gmail.com";
		trainer[2][3] = "3";
		
		//Task-3: Students Info
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter number of Students: ");
		
		int n = scan.nextInt();		
		
		String[][] student = new String[n][5];
		
		for(int i = 0; i < n; i++) {
			for(int j =0; j < 1; j++) {	
			
				// Entries for student name, email, phone, address, status
				
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
		
		System.out.println("Please enter the student number for information: ");
		
		int num = scan.nextInt();		
			
		System.out.print("Student number:" + num + " Name, E-mail, Phone Number, Address, and Status are: ");
			
		for(int j = 0; j < 5; j++) {				
				
			System.out.print( student[num][j] + ", ");			
				
		}// end of j		
		
	}//end of main	

} // end of class
