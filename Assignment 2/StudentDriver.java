import java.util.*;
public class StudentDriver{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter address of student");
		String line1=sc.next();
		String line2=sc.next();
		String city=sc.next();
		String state=sc.next();
		int pincode-sc.nextInt();
		Address addr=new Address(line1,line2,city,state,pincode);
		System.out.println("enter qualification of student");
		String qualName=sc.next();
		String university=sc.next();
		String institute=sc.next();
		float cgpa=sc.nextFloat();
		Qualification qualification=new Qualification(qualName,university,institute,cgpa);
		System.out.println("enter project details of the student");
		String name=sc.next();
		String startDate1=sc.next();
		String startDate=new SimpleDateFormat("dd/mm/yyyy").parse(startDate1);
		String endDate1=sc.next();
		2 endDate=new SimpleDateFormat("dd/mm/yyyy").parse(endDate1);
		String role=sc.next();
		String responsibilities1=sc.next();
		String responsibilities2=sc.next();
		String[] responsibilities={responsibilities1,responsibilities2};
		Project project1=new Project(name,startDate,endDate,role,responsibilities);
		System.out.println("Enter personal information of student");
		String firstname=sc.next();
		String lastname=sc.next();
		String dob1=sc.next();
		Date dob=new SimpleDateFormat("dd/mm/yyyy").parse(dob1);
		String skills=sc.next();
		String email=sc.next();
		String contactno=sc.next();
		Qualification[] qual={qualification};
		Project project[]={project1};
		Student st=Student(firstname,lastname,addr,dob,skills,qual,project,email,contactno);
		st.display();


	}
}