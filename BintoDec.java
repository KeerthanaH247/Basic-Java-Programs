package Basics;

public class BintoDec {

	public static void main(String[] args) {
		int num = 1010;
		System.out.println(Integer.parseInt(Integer.toString(num), 2));
		int n=10;
		String s="";
		int rem;
		while(!(n==0)) {
			rem=n%2;
			n=n/2;s=rem+s;
		}
		System.out.println(s);
	}

}
