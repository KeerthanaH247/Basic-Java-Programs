package Basics;

public class SumOfNumbersUsingRecursiveFunction {
	public static int abc(int i) {
		int sum=1;
		if(i==0)	return 0;
			sum=i+abc(i-1);
			
			return sum;
	}
	public static void main(String[] args) {
		System.out.println(abc(10));
		
	}

}
