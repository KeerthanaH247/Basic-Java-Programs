
package Basics;

public class NumberOfOccurenceOfMentionedCharacter {
	//Non case sensitive
	public static void main(String[] args) {
		String str="Hello I am keerthana";
		int count=0;
		char c='a';
		char[] ch=str.toCharArray();
		for(char a:ch) {
			if(a==c) {
				count++;
			}
		}
		System.out.println(count);
		//Case sensitive
		String s="WELCOME to java and Selenium";
		char m='l';
		char[] s1=s.toLowerCase().toCharArray();
		char m1= Character.toLowerCase(m);
		int count1=0;
		for(char b:s1) {
			if(b==m1) {
				count1++;
			}
		}
		System.out.println(count1);
		if(count1>1) {
			System.out.println("Duplicate element found");
		}
		else {
			System.out.println("Duplicate element not found");

		}
	
		}
	}


