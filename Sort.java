package Basics;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int[] array= {6,2,5,1,9,3,7};
		int temp;
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]<array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(array));
	}

}
