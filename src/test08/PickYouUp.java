package test08;

import java.util.Random;

public class PickYouUp {

	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(16)+1);
		String str = "123,1";
		int idx = str.indexOf(",");
		str = str.substring(idx);
		System.out.println(str);
	}
}
