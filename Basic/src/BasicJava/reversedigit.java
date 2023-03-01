package BasicJava;

public class reversedigit {

	public static void main(String[] args) 
	{

String s = "raju";
for(int i=s.length()-1;i>=0;i--)
{
System.out.print(s.charAt(i));

}
System.out.println("");
int n=156;
for (int i=0;i<=2;i++)
{
	int rem=n%10;
	System.out.print(rem);
	n=n/10;
}
	}

}
