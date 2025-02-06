package Basics;

public class Tofind2Ainyourname {

	public static void main(String[] args) {
		String s="keerthanaa";
		char e='a';
		int index=0;
		int cntr=0;
		while((index=s.indexOf(e,index))!=-1) {
			index++;
			cntr++;
		}
		if(cntr>=2) {
			System.out.println(cntr+" A's are present");
		}
		else {
			System.out.println(cntr+" "+e+" is present");
		}
		
	}

}
