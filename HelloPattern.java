package Basics;

public class HelloPattern {

	public static void main(String[] args) {
		System.out.println("Using charAt(i)");
		String s="Hello";
		for(int i=0;i<=s.length();i++) {
			for(int j=0;j<i;j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
		System.out.println("Using char arry");
		char[] arr=s.toCharArray();
		for(int i=0;i<=arr.length;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}
		String str="Using Char Array";
		char[] a=str.toCharArray();
		for(char c:a) {
			if(Character.isUpperCase(c)) {
				System.out.print(c+" ");
			}
		}
	}
}
