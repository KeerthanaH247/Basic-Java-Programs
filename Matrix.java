package Basics;

public class Matrix {

	public static void main(String[] args) {
		/*for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;i++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		int m=1;
		int n=3;
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++)
			{
				System.out.println(i+"-->"+j);
			}
		}
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
