package Basics;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=s.nextLine();
		int length=str.length();
		for(int i=0;i<length;i++) {
			for(int j=1;j<=length-i;j++) {
				String sub=str.substring(i, i+j);
				System.out.println(sub);
			}
		}
	
	}

}
