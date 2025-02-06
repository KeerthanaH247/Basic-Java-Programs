package Basics;

public class SmallLargeNumOfArray {

	public static void main(String[] args) {
		int temp;
		int[] a= {7,2,5,9,1,6,3,8};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]<a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		System.out.println(" Largest "+a[0]+"\n Smallest "+a[a.length-1]+"\n Second Largest "+a[1]+" \nSecond Smallest "+a[a.length-2]);
	
	
	}

}
