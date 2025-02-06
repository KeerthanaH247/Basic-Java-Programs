package Basics;

public class Heighest {

	public static void main(String[] args) {
		int[] num= {3,6,22,8,46,9,71,69,37};
		int big=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>big) {
				big=num[i];
		}
	}
		int sbig=0;
		for(int j=0;j<num.length;j++) {
			if(num[j]<big && sbig<num[j]) {
				sbig=num[j];
			}
		}
		System.out.println(sbig);
		
		
	}

}
