import java.util.Scanner;

public class StudentDriver1 {

	public static void main(String [] args)
	{
		//Declare Variables
		String firstName;
		String lastName;
		Address addr;
		String line1;
		String line2;
		String city;
		String state;
		int pinCode;
		
		
		// Declare the object and initialize with 
        // predefined standard input object 
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Enter the number of students for which details are to be maintained");
        n = sc.nextInt();
        sc.nextLine();
        int count =0;
        Student [] student = new Student[n];
        while(count<n){

        	System.out.println("Enter Student " + (count +1) + " Details");
            	//Input Name
        	System.out.println("Enter First Name:");
        	firstName=sc.nextLine();        
        	System.out.println("Enter Last Name:");
        	lastName = sc.nextLine();
        
       
		//Input Address
		System.out.println("Enter Address:");
		System.out.println("Line 1:");
		line1=sc.nextLine();
		System.out.println("Line 2:");
		line2=sc.nextLine();
		System.out.println("City:");
		city=sc.nextLine();
		System.out.println("State:");
		state=sc.nextLine();
		System.out.println("Pin Code");
		pinCode=sc.nextInt();
		sc.nextLine();
		addr = new Address(line1,line2,city,state,pinCode);
		
		student[count] = new Student(firstName, lastName,addr);
			student[count].display();
		   count++;
		}
		
	}
	
	

}
