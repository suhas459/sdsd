package lp;

import java.util.Scanner;

public class pelindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner (System.in);
		String orgstr = sc.next();
		String revStr="";
		
		for (int i=orgstr.length()-1;i>=0;i--) 
		{
			char t = orgstr.charAt(i);
			revStr=revStr+t;
			
		}
		
		System.out.println(revStr);
		
		if (orgstr.equals(revStr)) {
			System.out.println("given string is pelindrome");
		}else 
		{
			System.out.println("given string is not pelindrome");
		}
		
		
//		boolean a = orgstr.equalsIgnoreCase(revStr);
//		
//		if (a)
//		System.out.println("peli");
//		else {
//			System.out.println("not peli");
//		}
		
		
		
		
		
	}

}
