package Basics;

public class EvenAndOddArrayElement {

	public static void main(String[] args) {
		int[] arr= {0,1,2,3,4,5,6,7,8};
		System.out.println("Even numbers in an array");
		for(int i=0;i<arr.length;i+=2) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.println("Odd numbers in an array");
		for(int j=1;j<arr.length;j+=2) {
			System.out.print(arr[j]+"\t");
		}
		System.out.println();
		System.out.println("Even numbers");
		int[] num= {1,7,2,9,4,8,6,3};
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				System.out.print(num[i]+"\t");
			
			}
		}
		System.out.println();
			System.out.println("Odd numbers");
			for(int j=0;j<num.length;j++) {
				if(num[j]%2!=0){ 
				System.out.print(num[j]+"\t");
				}
		}
	}
}
	
