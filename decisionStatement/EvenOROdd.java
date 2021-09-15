package decisionStatement;

import java.util.Scanner;

public class EvenOROdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println(n+ "is a Even number");
		}
		else
		{
			System.out.println(n+"is a od number");
		}
		
	}

}
