package Basics;

public class StringSort {

	public static void main(String[] args) {
		String a="one";
		String b="two";
		a=a+b;
		System.out.println(a);
		b=a.replace(b, "");
		System.out.println(b);
		a=a.replace(b, "");
		System.out.println("a="+a+" and b=" +b);
	}

}
