package nik;

public class commandlineargs {
public static void main(String args[])
{
	StringBuffer sb1=new StringBuffer();
	sb1.append("deloitte");
	System.out.println(sb1);
	System.out.println(sb1.length());
	System.out.println(sb1.delete(7,10));
	System.out.println(sb1.reverse());
	System.out.println(sb1.replace(6,11, "JAVa"));
	String str="dabang3";
	StringBuffer sbr=new StringBuffer();
	
	sbr.append(str);
	System.out.println(sbr);
	String str2=sbr.toString();
	System.out.println(str2);
	StringBuilder builder=new StringBuilder();
	builder.append("abcde");
	
	
}
}
