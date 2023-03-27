package exceptioninJava;

import java.util.ArrayList;

public class Nullexception {

	public static void main(String[] args) {
		ArrayList<String> list = null;
		list.get(0);
		
		String str = null;
		System.out.println(str.length());
		
		{
	//Arthicmetric expection
			int a =30;
			int b = 0;
			int c = a/b;
			System.out.println("result" + c);
			
		}

	}

}
