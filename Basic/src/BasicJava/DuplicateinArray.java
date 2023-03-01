package BasicJava;

public class DuplicateinArray {
	public static int dupremove(int ar[],int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		int t[]=new int [n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
		if(ar[i]!=ar[i+1])
		{
			t[j++]=ar[i];
		}
		
		}
		t[j++]=ar[n-1];
		for(int i=0;i<j;i++)
		{
		ar[i]=t[i];	
		}
		return j;
	}

	public static void main(String[] args) 
	{
		
		
	int ar[]= {1,2,1,4,2};
	int length=ar.length;
	length= dupremove(ar,length);
  for(int i=0;i<length;i++)
  {
	System.out.print(ar[i]);
	  }
  
 
	}

}
