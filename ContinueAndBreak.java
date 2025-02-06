package Basics;

import java.util.Scanner;

public class ContinueAndBreak {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(true){
		System.out.println("Enter an integer");
		int n=s.nextInt();
		if(n!=0) {
			continue;
		}
		else {
			break;
		}
		}
		

	}

}
