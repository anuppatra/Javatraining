package javuu;

public class palindrome {
public static void main(String args[])
{
	
	String rev;
	String x;
	
	
	StringBuffer input=new StringBuffer(x);
	input=args[0];
	rev=input.toString();
	
	if(x.equals(rev))
	{
		System.out.println("This is a Palindrome");
	}
	else
	{
		System.out.println("This is not a palindrome");
	}
	
}
}
