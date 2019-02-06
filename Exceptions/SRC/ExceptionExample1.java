import java.util.Scanner;
class ExceptionExample1{
	public static void main(String[] args)
	{
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		try{
		System.out.println("\nEnter the value of a ");
		a = sc.nextInt();
		System.out.println("\nEnter the value of b");
		b = sc.nextInt();
		c = a/b;

		System.out.println("\na =" +a +" b =" +b + " a/b = " +c);
	}
	catch(ArithmeticException e){
		System.out.println("Exception "+e);
	}
	finally{
		System.out.println("In finally");
	}
}
}