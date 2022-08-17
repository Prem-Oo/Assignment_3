//WAP to count number of special characters.
package assignment_3;

import java.util.Scanner;

public class SpecialChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		String s=sc.nextLine().trim();
		s=s.replaceAll(" ", "");
		for(int i=0;i<s.length();i++) {
			if(Character.isLetterOrDigit(s.charAt(i)))
				count++;
		}
		System.out.println("Count of special characters : "+(s.length()-count));
		//System.out.println(count);
	}

}
