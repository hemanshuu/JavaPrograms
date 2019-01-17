import java.util.*;
 
    class Heart{
 
       long d;
     
    String firstName, lastName;



    public void dateofbirth ();

   

 
 
    public void HeartRate(String FName, String LName,int mon, int da, int ye ) {
 
        this.firstName = FName;
        this.lastName = LName;
        d = new dateofbirth(da,mon,ye);
        
    }
    public void setFirstName(String FName) {
        firstName = FName;
    }
    
    public String getFirstName() {
        return firstName;
    }
 
        public void setLastName(String LName) {
        lastName = LName;
        }
 
     
    public String getlastName() {
        return lastName;
    }
       
 
    public int getAge(){
        return 2019 - d.year;
        }
 
    public int MaximumHeartRate() {
        return 220 - getAge();
    }
 
    public void targetHeartRate(){
    System.out.print("Target Heart Rate Range: "+ MaximumHeartRate() * 0.5 + " to "+ MaximumHeartRate() * 0.85);
    }
}