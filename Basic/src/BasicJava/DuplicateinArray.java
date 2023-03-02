package BasicJava;

public class DuplicateinArray {
	
	public static void main(String[] args) 
	{
		
		
	int ar[]= {1,2,1,4,2};
	int length=ar.length;
	System.out.println("With Duplicate No :");
	for(int b:ar)
	{
		
		System.out.print(b);
	}
	System.out.println("");
	System.out.println("The  Duplicate No are :");
	//4
  for(int i=0;i<length;i++)//0123
  {
	  for(int j=i+1;j<length;j++)//123
	  {
	       if(ar[i]==ar[j])
	{
		
		System.out.print(ar[i]);
		
	}
	  }
	  }
  
 
	}

}
