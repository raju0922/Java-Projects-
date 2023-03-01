package BasicJava;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args)
	{
		int p,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number from 1 to 100");
		p=sc.nextInt();
	     	 int m=p/2;
			 if(p==0||p==1)
			{
				System.out.println(p+"Its not a prime number");
				
			}
			for(int i=2;i<=m;i++)
			{
			while(p%i==0)
			{
				System.out.println(p+"Its not a prime number");
				flag+=1;
				break;
			}
			}
			if (flag==0)
			{
				System.out.println(p+" -  it is prime number");
			}
			
			
	}

}
