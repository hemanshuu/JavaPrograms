import java.util.Scanner;

class MultiCatch{
	public static void main(String args[])
	{
		try{
			int a;
			int b;
			int c;
			int[] d = {2};
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value of a");
			a = sc.nextInt();
			System.out.println("a= " +a);
			System.out.println("Enter value of b");
			b = sc.nextInt();
			System.out.println("b =" +b);
			c = a/b;
			d[2] = 99;

		}
		catch(ArithmeticException e){
			System.out.println("Divide by 0:" +e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index oob:" +e);
		}
		System.out.println("After try/catch blocks.");
	}
}