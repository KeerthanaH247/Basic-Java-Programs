package Basics;

public class FindSpecificNumOrString {

	public static void main(String[] args) {
		//To find specified number
		int n=7;
		int[] num= {2,4,6,8,10};
		String msg="Not found";
		for(int i=0;i<num.length;i++) {
			if(num[i]==n) {
				msg="Found";
				break;
			}
		}
		System.out.println(msg);
		// To find specified string
		String[] animals= {"dog","cat","pig","cow","hen","pig","monkey"};
		String a="cat";
		String f="Not found";
		
		for(int i=0;i<animals.length;i++) {
			if(animals[i].equalsIgnoreCase(a)) {
				f="Found";
				break;
			}
		}
		System.out.println(f);

}
}