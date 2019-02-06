import java.util.Scanner;
class ThrowExample{
	public static void main(String[] args){
	int day;
	boolean flag = true;
	Scanner sc = new Scanner(System.in);
	while(flag){
		try{
			System.out.println("Enter Day:");
			day = sc.nextInt();
            if(day<0 || day>31)
            	throw new Exception("Exception: Invalid Day");
            else
            	{
            		System.out.println("Entered Day: " +day);
            flag = false;
        }
		
		catch(Exception e){
			System.out.println(e.toString());
		
	}
}
}