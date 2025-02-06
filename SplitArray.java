package Basics;

import java.util.Arrays;

public class SplitArray {

	public static void main(String[] args) {
		int[] i=new int[] {1,2,3,4,5,6,7,8,9};
		int[] arr1=Arrays.copyOfRange(i, 0, 2);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println();
		int[] arr2=Arrays.copyOfRange(i, 2, 4);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println();int[] arr3=Arrays.copyOfRange(i, 4, 8);
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
//		System.out.println(arr3[4]);
	
	}

}
