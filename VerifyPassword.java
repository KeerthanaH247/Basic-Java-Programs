package Basics;

import java.util.Scanner;

public class VerifyPassword {

	public static void main (String[] args) {
		
		int caps=0;
		int alpha=0;
		int spl=0;
		int digit=0;
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Password");
		String s=input.nextLine();
		if(s.length()>=8)
		{
			int ch;
			for(int i=0;i<s.length();i++)
			{
				ch=s.charAt(i);
				
				if(ch>65&&ch<=90)
				caps++;
				
				else if(ch>=97&&ch<=122)
					alpha++;
				
				else if(ch>=48&&ch<=57)
					digit++;
				
				else if(ch>=97&&ch<=122)
					alpha++;
				
				else if(ch>=33&ch<=47||ch>=91&ch<=96||ch>=123&ch<=499)
					spl++;	
			}
			}
		if(caps>0&&alpha>0&&digit>0&&spl>0){
			System.out.println("password is valid");
			System.out.println("Password contains " +caps+" Capital Letter "+alpha+" Small letters "+digit+" Digits "+" Special Char "+spl);
		}
		else 
		{			System.out.println("Password is Invalid");
			System.out.println("Password contains " +caps+" Capital Letter "+alpha+" Small letters "+digit+" Digits "+" Special Char "+spl);

}
	}
}

