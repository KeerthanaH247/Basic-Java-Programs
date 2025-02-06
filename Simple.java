package Basics;

import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		System.out.println(10+"\n"+20+"\n"+30+"\n"+40);
		System.out.println(10+"\t"+20+"\t"+30+"\t"+40);
		System.out.println("Ramesh"+"\n"+"\n"+"Suresh"+"\n"+"\n"+"Mahesh");
		String str="namaste";
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i)+"\t");
		}
		System.out.println("String to char Array");
		char[] ch=str.toCharArray();
		//for(int j=0;j<ch.length;j++) {
		for(char j:ch) {
			System.out.println(j);
		}
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Sum of "+n+" is "+sum);
	}
}

