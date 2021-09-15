package decisionStatement;
import java.util.Scanner;
public class Sresult
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("studets results");
	int marks =sc.nextInt();
	if (marks>=35)
	{
		System.out.println("student is pass");
	}
	else
	{
		System.out.println("Result is fail");
	}
	
}
}
