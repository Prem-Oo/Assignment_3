//WAP to sort a String Alphabetically.
package assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class StringSorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().trim();
//		s=s.replaceAll(" ", "");
//		System.out.println(s);
		char[] c=s.toCharArray();
		Arrays.sort(c);
//		s=String.valueOf(c);
//		System.out.println(s);
		System.out.println(new String(c).trim());
	}

}
