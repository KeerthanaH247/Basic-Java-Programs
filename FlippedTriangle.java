package Basics;

public class FlippedTriangle {

	public static void main(String[] args) {
		System.out.println("Flipped triangle");
		for(int i=5;i>0;i--) {
			for(int k=0;k<5-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("triangle");
		for(int i=0;i<=5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Number flipped triangle");
		int c=1,s=1;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
				s=c+i-1;
			}
			for(int k=0;k<i;k++) {
				System.out.print(s+" ");
			s--;c++;
			}
			System.out.println();
		}
	}

}
