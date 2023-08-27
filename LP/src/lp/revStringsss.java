package lp;

import java.util.Scanner;

public class revStringsss {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		String orgString = sc.next();
		String revString="";
		
		for (int i=orgString.length()-1;i>=0;i--) {
			char t = orgString.charAt(i);
			revString=revString+t;
			
		}
		
		System.out.println(revString);
		
		
		
		
		
		
		
		
		

	}

}
