package Basics;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to check Palindrome");
		int num=s.nextInt();
		int sum=0,r,temp;
		temp=num;
		while(num>0) {
			r=num%10;
			sum=sum+(r*r*r);
			num=num%10;
			
		}
		if(temp==sum) {
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}

