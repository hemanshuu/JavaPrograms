import java.util.*;   

class Sum

{
	public static void main (String args[])

	{
		double sum=1;
		Scanner in =new Scanner(System.in);
		System.out.print("enter the value for x: \n");
		double x= in.nextInt();
		System.out.print("enter the number of terms: \n");
		double n= in.nextInt();
		int i,j,fact;
		for (i=1;i<=n;i++)
		{
			fact=1;
			for (j=1;j<=i ;j++ ) 
			
				fact=fact*j;
				sum=sum+(Math.pow(x,i)/fact);
			
		}
		System.out.print("sum is :"+sum);	

    
}  

}