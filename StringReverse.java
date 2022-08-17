package assignment_3;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine().trim();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		

	}

}
