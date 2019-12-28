package javuu;

public class noDays {
public static void main(String args[])
{
	String month=args[0];
	int days=0;
	switch(month)
	{
	case "jan":
		days=31;
		break;
	case "feb":
		days=28;
		break;
	case "march":
		days=31;
		break;
	case "april":
		days=30;
		break;
	case "june":
		days=30;
		break;
	case "july":
		days=31;
		break;
	case "aug":
		days=31;
		break;
	case "sept":
		days=31;
		break;
	case "oct":
		days=31;
		break;
	case "nov":
		days=30;
		break;
	case "dec":
		days=31;
		break;
	default:
		days=0;
	}
	
	System.out.println(days);
}
}
