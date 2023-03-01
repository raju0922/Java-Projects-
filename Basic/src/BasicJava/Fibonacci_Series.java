package BasicJava;

import java.util.Scanner;

public class Fibonacci_Series
{

	public static void main(String[] args) 
	{
		 int n1=0,n2=1,n3,i;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
 System.out.println("Enter no from 1 to 100 to generate fibonacci series ");
int n=sc.nextInt();
System.out.println(n1);
System.out.println(n2);
for(i=0;i<=n;i++)
{
	n3=n1+n2;
	System.out.println(n3);
   n1=n2;
   n2=n3;
}
	}

}
