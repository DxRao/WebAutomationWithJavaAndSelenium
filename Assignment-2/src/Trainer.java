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
		
		// Creation of Trainer Array to store various Trainers' objects information.	
		
		Trainer[] trainer = new Trainer[3];
		
		trainer[0] = trainer1;
		trainer[1] = trainer2;
		trainer[2] = trainer3;
		
		
	}//end of main	

} // end of class
