package Basics;

public class ManipulateString {

	public static void main(String[] args) {
		String s1="water";
		String s2="bottle";
		int mid=(s1.length()+1)/2;
	
//		String firstHalf=s1.substring(0,mid);
//		String secondHalf=s1.substring(mid);
//		String result=firstHalf+s2+secondHalf;
		System.out.println(s1.substring(0,mid)+s2+s1.substring(s1.length()/2));
	}

}
