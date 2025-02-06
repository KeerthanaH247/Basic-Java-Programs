package Basics;

import java.io.IOException;

public class OpenWebsite {

	public static void main(String[] args) {
		Runtime rs=Runtime.getRuntime();
		try {
			rs.exec("cmd /c start https://www.amazon.in/");
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
