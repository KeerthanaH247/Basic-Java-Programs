package Basics;

public class SumOfNumInGivenString {

	public static void main(String[] args) {
		String s="dg28i055eio91";
		char[] ch=s.toCharArray();
		int sum=0;
		for(char a:ch) {
			if(Character.isDigit(a)) {
				int v=Integer.parseInt(""+a);
				sum+=v;
			}
		}
		System.out.println("Sum of the numbers in a given string :"+sum);
		
		//To count the no of digits in a given string
		int count=0;
		for(char h:ch) {
			if(Character.isDigit(h)) {
				count++;
			}
		}
		System.out.println("Total number of digits in a given string :"+count);
	}

}
