package Basics;

import java.util.Scanner;

public class BasicOperations {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two non zero numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
		if(a>b) {
		System.out.println("Difference between "+a+" and "+b+" is "+(a-b));
		System.out.println("Quotient of "+a+" and "+b+" is "+(a/b));
		System.out.println("Remainder of "+a+" and "+b+" is "+(a%b));

		}
		else {
			System.out.println("Difference between "+b+" and "+a+" is "+(b-a));
			System.out.println("Quotient of "+b+" and "+a+" is "+(b/a));
			System.out.println("Remainder of "+b+" and "+a+" is "+(b%a));

		}
		System.out.println("Product of "+a+" and "+b+" is "+(a*b));
		for(String t:args) {
			System.out.println(t);
		}
	}

}
