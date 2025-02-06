package Basics;

public class CompareArray {

	public static void main(String[] args) {
		int[] arr1= {1,2,3};
		int[] arr2= {1,2,3};
		String msg="Same";
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				msg="Different";
				break;
			}
		}
		System.out.println(msg);
	}

}
