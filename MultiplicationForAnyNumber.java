package Basics;

import java.util.Scanner;

public class MultiplicationForAnyNumber {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter range of numbers to print their multiplication table");
		a=s.nextInt();
		b=s.nextInt();
		for(c=a;c<=b;c++) {
			System.out.println("Multiplication table for "+c);
			for(d=1;d<=10;d++) {
				System.out.println(c+"*"+d+"="+(c*d));
			}
		}
	}

}
