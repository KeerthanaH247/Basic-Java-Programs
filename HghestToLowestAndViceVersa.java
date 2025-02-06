package Basics;

public class HghestToLowestAndViceVersa {
	public static void test(int i) {
		if(i>=0) {
			System.out.println(i);
			test(i-1);
		}
		
	}
	public static void test1(int i) {
		if(i>0) {
			test(i-1);
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		test(4);
		System.out.println();
		test1(4);
	}

}
