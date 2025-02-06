package Basics;

public class SpaceCount {

	public static void main(String[] args) {
		System.out.println("Using CharAt(i)");
		String s="I usually wath 3 movies in a day but now 1 movie in three days";
		int c1=0;
		int c2=0;
		for(int i=0;i<s.length();i++) {
			char a=s.charAt(i);
			if(a==' ') {
				c1++;
			}
		}
		System.out.println(c1);
		System.out.println("Using CharArray");
		char[] b=s.toCharArray();
		for(char c:b) {
			if(c==' ') {
				c2++;
			}
		}
		System.out.println(c2);
		System.out.println("Using Split method");
		String[] d=s.split(" ");
		System.out.println(d.length-1);
	}

}
