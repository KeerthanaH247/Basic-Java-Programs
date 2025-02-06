package Basics;

public class SeparateMixedString {

	public static void main(String[] args) {
		String s="1b@4e^7h(j09jdhkjahfk*(^)*&^)&*";
		String num="";
		String alpha="";
		String spcl="";
		char[] ch=s.toCharArray();
		for(char c:ch) {
			if(Character.isDigit(c)) {
				num=num+c;
			}
			else if(Character.isAlphabetic(c)) {
				alpha=alpha+c;
			}
			else
				spcl=spcl+c;
		}
	System.out.println(num);
	System.out.println(alpha);
	System.out.println(spcl);
	
	}

}
