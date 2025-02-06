package Basics;

public class RotateArray {

	public static void main(String[] args) {
		System.out.println("Rotate full array");
		int[] arr= {10,20,30,40,50,60,70,80,90,100};
		int start=0;
		int end=arr.length-1;
		int temp=0;
		for(int i=0;i<arr.length/2;i++) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		for(int i:arr) {
		System.out.println(i);
		
		System.out.println("To rotate first half of the array");
		int[] arr1={10,20,30,40,50,60,70,80,90,100};
		int first=0;
		int last=arr1.length/2-1;
		int temp1=0;
		for(int j=0;j<arr1.length/2-arr1.length/4;j++) {
			temp1=arr1[first];
			arr1[first]=arr1[last];
			arr1[last]=temp1;
			first++;
			last--;
			}
		for(int j:arr1) {
			System.out.println(j);
		}
		System.out.println("To rotate second half of the array");
		int[] arr2={10,20,30,40,50,60,70,80,90,100};
		int start1=arr.length/2;
		int end1=arr.length-1;
		int temp2=0;
		for(int k=arr.length/2;k<arr.length/2+arr.length/4;k++) {
			temp2=arr2[start1];
			arr2[start1]=arr2[end1];
			arr2[end1]=temp2;
			start1++;
			end1--;
		}
		for(int k:arr2) {
			System.out.println(k);
		}
		System.out.println("print the values of an array present at 4th index to 7th index values in an array");
		int[] arr3={10,20,30,40,50,60,70,80,90,100};
		for(int l=4;l<=7;l++) {
			System.out.println(l);
		}
	}
}
}


