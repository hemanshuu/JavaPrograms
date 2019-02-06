import java.util.Date;

public class Student {

    String firstname;
    String lastname;
    Address addr;
    Date dob;
    Qualification[] qual;
    Project[] project;
    String email;
    String contactno;

    public Student(String firstname,String lastname,Address addr,Date dob,Qualification[] qual,Project[] project,String email,String contactno){
        this.firstname=firstname;
        this.lastname=lastname;
        this.addr=addr;
        this.dob=dob;
        this.qual=qual;
        this.project=project;
        this.email=email;
        this.contactno=contactno;
    }
    
    public void display(){
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(addr);
        System.out.println(dob);
        System.out.println(qual);
        System.out.println(project);
        System.out.println(email);
        System.out.println(contactno);
    }
}