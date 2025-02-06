package Basics;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows ");
		int num=s.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=num-i;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(1+" ");
			}
			System.out.println();
		}
	}

}
