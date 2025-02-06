package Basics;

import java.math.BigInteger;
import java.util.Scanner;

public class SumLargeNumbers {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String num1,num2;
	System.out.println("Enter first largest number");
	num1=s.nextLine();
	System.out.println("Enter second largest number");
	num2=s.nextLine();
	
	BigInteger first=new BigInteger(num1);
	BigInteger second=new BigInteger(num1);
	BigInteger sum;
	sum=first.add(second);
	System.out.println(sum);
	
	}

}
