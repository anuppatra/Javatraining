package nik;
import java.util.Scanner;


public class StudentResult {
public class array2d {

public static void main(String args[])
{
	int regno;
	int	sub1;
	int sub2;
	int sub3;
	int total;
	float average;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter regno,sub1,sub2,sub3");
	regno=sc.nextInt();
	sub1=sc.nextInt();
	sub2=sc.nextInt();
	sub3=sc.nextInt(	);
	
	total=sub1+sub2+sub3;
	average=total/3;
	
	if(sub1>=40 && sub2>=40 && sub3>=40)
	{
		System.out.println("Passed");
		
	}
	
	
	else {
		System.out.println("fail");
		
	}
	
	System.out.println("total is "+total+"average is "+average);
	
	
	
}
}
