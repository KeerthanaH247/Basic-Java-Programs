package Basics;

public class StringBasic {

	public static void main(String[] args) {
		System.out.println("String compare");
		String s1="Hello";
		String s2="hello";
		String s3="    HELLO.. welcome to my world     ";
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.toLowerCase().equals(s2));
		System.out.println(s3.endsWith("ld"));
		int s4=s3.indexOf("t",4);
		System.out.println("s4"+s4);
		System.out.println(s3.trim());
		String str="Java Programming Language";
		System.out.println(str.length());
		System.out.println(str.concat(" is fun"));
		System.out.println(str.replace("Java", "Selenium"));
				}

}
