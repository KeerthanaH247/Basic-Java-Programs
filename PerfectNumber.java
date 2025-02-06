package Basics;

public class PerfectNumber {

	public static void main(String[] args) {
		int sum=0,x=0;
		for(int num=1;num<500;num++) {
			for(int i=1;i<num;i++) {
				x=num%i;
				if(x==0) {
					sum+=i;
				}
				if(sum==num) {
					System.out.println("Perfect number is:"+num);
					System.out.println("FActors are");
					for(int j=1;j<num;j++) {
						x=num%j;
						if(x==0) {
							System.out.println(j);
						}
							
						}
					sum=0;
				}
			}
		}
	}

}
