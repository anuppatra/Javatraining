package javuu;

public class stringalterations {
	public static void main(String args[])
	{
		String name=args[0];
		
		for(int i=1;i<name.length();i++)
		{		
			String a=name.substring(0,i);
			System.out.println(a);
		}
	}

}
