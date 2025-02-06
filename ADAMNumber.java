package Basics;

import java.util.Scanner;

public class ADAMNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		
		//Square of a num
		int sqr=num*num;
		
		//Reverse num
		int reversenum=0, temp=num;
		while(temp>0) {
			reversenum=reversenum*10+temp%10;
			temp/=10;
		}
		//Reverse Square num
		int reversesqr=reversenum*reversenum;
		
		int reversedsqr=0,tempsqr=sqr;
		while(tempsqr>0) {
			reversedsqr=reversedsqr*10+tempsqr%10;
			tempsqr/=10;
		}
		if(reversesqr==reversedsqr) {
			System.out.println("ADAM number");
		}
		else {
			System.out.println("Not an ADAM number");

		}
	}

}
