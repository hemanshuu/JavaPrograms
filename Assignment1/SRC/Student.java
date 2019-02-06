public class Student {

	String firstName;
	String lastName;
	Address addr;
		
	public Student(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	
		
	}
	
	public Student (String firstName,String lastName,Address addr)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.addr=addr;
		
	}
	public void display()
	{
		System.out.println("Student Details");
        System.out.println("Name::"+firstName+" "+lastName);
        System.out.print("Address::");
        addr.display();
        
	}
}