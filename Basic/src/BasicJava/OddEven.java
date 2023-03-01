package BasicJava;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter a number from 1 to 100");
		Scanner scn = new Scanner(System.in);
		n=scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			
			if ( i%2 ==0)
			{
				System.out.println(i+ "   Its an even Number");
				
			}
			if(i%2!=0)
			{
			System.out.println(i+ "   Its an odd Number");
			}
			}

	}

}
