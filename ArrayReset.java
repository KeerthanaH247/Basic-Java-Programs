package Basics;

public class ArrayReset {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		arr[2]=0;
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=0;
		}
		for(int i:arr) 
		System.out.println(i);
		
	}

}
