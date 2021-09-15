package decisionStatement;

import java.util.Scanner;

public class Largest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first Numbers");
	int num1=sc.nextInt();
	System.out.println("enter the  second Numbers");
	int num2=sc.nextInt();
	if(num1>num2)
	{
		System.out.println("num1 is largest");
	}
	else
	{
		System.out.println("num2 is large");
	}
	
}
}
