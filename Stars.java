package Basics;

public class Stars {

	public static void main(String[] args) {
		int row, numOfStars;
		for(row=1;row<=5;row++) {
			for(numOfStars=1;numOfStars<=row;row++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}

}
