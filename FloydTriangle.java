package Basics;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		int n,num=1,c,d;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows of Floyd Triangle you want");
		n=s.nextInt();
		System.out.println("Floyd Triangle is");
		for(c=1;c<=n;c++) {
			for(d=1;d<=c;d++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();	
		}
				}

}
