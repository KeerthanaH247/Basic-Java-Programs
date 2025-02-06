package Basics;

public class ExtractNumber {

	public static void main(String[] args) {
		String s="a2b6pi9 mn317ys";
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isDigit(c)) {
				s1=s1+c;
			}
			if(Character.isAlphabetic(c)){
				s2+=c;
			}
		}
		System.out.println(s1);
		System.out.println(s2);
			}
}

