package Basics;

public class FindDuplicateStringAndNum {

	public static void main(String[] args) {
		//To find Duplicate number
		int[] num= {8,1,9,7,1,3,1,1,7,8};
		int count=0;
		//int n=5;
		String msg="Not found";
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					count++;
				}
			}
		}
			
		if(count>1) {
			System.out.println("Duplicate number found ");
		}
		else
			System.out.println("Duplicate element not found");
		//To find Duplicate String
		String[] str={"Hello", "welcome" ,"to","java","To"};
		String s="Welcome";
		int repeat=0;
		for(int i=0;i<str.length;i++) {
			
				if(str[i].equalsIgnoreCase(s)) {
					repeat++;
				
			}
		}
		System.out.println(repeat);
	}


}
