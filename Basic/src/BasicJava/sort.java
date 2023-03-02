package BasicJava;

public class sort {

	public static void main(String[] args)
	{
	int[]a= {1,2,4,5,2,0,8,9};	
	for(int b:a)
	{
		System.out.print(b);
	
	}
	System.out.println("");
	for(int i=0;i<a.length;i++)
	  {
		for(int j=i+1;j<a.length;j++)
			if(a[i]>a[j])
			{
				int temp;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
	  }
	System.out.println("The Sorted Arrays are");
	for(int b:a)
	{
		System.out.print(b);
	}
	System.out.println("");
	System.out.println("Descending Order");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]);
	}
	}

}
