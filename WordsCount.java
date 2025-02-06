package Basics;

public class WordsCount {

	public static void main(String[] args) {
		String s="What makes you beautiful by one direction";
		int count=0;
		String[] s1=s.split(" ");
		System.out.println("Number of words in a given string is :"+s1.length);
		System.out.println("Method -2");
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c==' ') {
			count++;
		}
	}
		System.out.println(count+1);
	}
}
