/*WAP to check if the String is Anagram or not*/
package assignment_3;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer();
		s1.append(sc.nextLine().toLowerCase());
		s2.append(sc.nextLine().toLowerCase());
		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				for(int j=0;j<s2.length();j++) {
					if(s1.charAt(i)==s2.charAt(j)) {
						s2.deleteCharAt(j);
						break;
					}
				}
			}
			if(s2.isEmpty())
				System.out.println("Given Strings are Anagram");
			else
				System.out.println("Not Anagram");
		}
		else
			System.out.println("Not anagram");
	}

}
