package Basics;

public class NullArgument {
	public static void test(Object s) {
		System.out.println(" Object argument");
	}
	public static void test(String s) {
		System.out.println("String argument");
	}
	public static void main(String[] args) {
		test(null);
	}

}
