package Basics;

public class PrintANumberWithoutUsingLoop {
		public static void test(int i) {
			if(i<=0) {
				System.out.println("End");
			}
			else {
				test(i-1);
				System.out.println(i);
			}
		}

	public static void main(String[] args) {
		test(5);
		
	}

}
