package Basics;

public class Prime {
	public static boolean isPrime(int n){
		if(n<=1){
			return false;
			}
		else{
			boolean flag=true;
			for(int i=2;i<n;i++)
			{
				if(n%i==0){
					flag=false;
					break;
					}
				}
		return flag;
	}}

	public static void main(String[] args) {
		int num=4;
		String msg="Prime";
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				msg="not a prime";
			}
		}
		System.out.println(msg);
		
		for(int j=1;j<=1000;j++) {
			if(isPrime(j)) {
				System.out.println(j);
			}
		}
	}

}
