package Basics;

public class Swap {

	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("The value of  a is "+a+" and b is "+b+".Before swapping");
		System.out.println();
		System.out.println("Swapping using temp");
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("The value of  a is "+a+" and b is "+b+".After swapping using temp");
		System.out.println();
		System.out.println("Swapping without using temp");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The value of  a is "+a+" and b is "+b+".After swapping without using temp");
		System.out.println();
		System.out.println("Using bitwise operator");
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("The value of  a is "+a+" and b is "+b+".After swapping using Bitwise operator");


	}

}
