package Basics;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Panlindrome String");
		String s="madam";
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s1+s.charAt(i);
		}
		if(s.equals(s1)) {
			System.out.println("Palindrome");
		}
		else { System.out.println("Not a Palindrome");}
		System.out.println("Palindrome number");
		int num=1212;
		int sum=0,r,temp=num;
		while(temp>0) {
			r=temp%10;
			sum=sum*10+r;
			temp/=10;
			
		}
		if(num==sum) {
			System.out.println("Palindrome");

		}
		else { System.out.println("Not a Palindrome");}
 
	}

}
