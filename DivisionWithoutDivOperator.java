package Basics;

public class DivisionWithoutDivOperator {

	public static void main(String[] args) {
		int number=12;
		int devisor=3;
		int result=0;
		while((number-devisor)>=0){
			result++;
			number-=devisor;
		}
		System.out.println(result);
		int num1=12;
		int num2=3;
		int result1=0;
		for(int i=1;i<=num2;i++) {
			result1+=num1;
		}
		System.out.println(result1);
	}

}
