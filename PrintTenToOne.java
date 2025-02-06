package Basics;

public class PrintTenToOne {
	public static void test(int i) {
		if(i<=0) {
			System.out.println("End");
		}
		else {
			System.out.println(i);
			test(i-1);
		}
	}

	public static void main(String[] args) {
		test(10);
		System.out.println("Using for loop");
		for(int i=10;i>0;i--) {
			System.out.print(i+"\t");
		}
	}

}
