package Basics;

public class Increment {

	public static void main(String[] args) {
		int a=20;
		System.out.println(a++);
		System.out.println(++a);
		a=a++ + ++a;
		System.out.println(a);
		int i=5;
		System.out.println(i++);
		int j=5;
		System.out.println(++j);
		System.out.println("\"Hello world\"");
	}

}
