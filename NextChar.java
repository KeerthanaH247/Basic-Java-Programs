package Basics;

public class NextChar {

	public static void main(String[] args) {
	String s="selenium";
	StringBuffer sb1=new StringBuffer();
	StringBuffer sb2=new StringBuffer();
	char[] arr=s.toCharArray();
	for(int i=0;i<s.length();i++) {
		char ch=arr[i];
		char ch1=arr[i];
		sb1=sb1.append(++ch);
		sb2=sb2.append(--ch1);
	}
	System.out.println(sb1+"\n"+ sb2);
	}

}
