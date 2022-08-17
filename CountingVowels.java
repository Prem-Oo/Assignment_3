//WAP to count the number of Vowels and Consonants of a String value.
package assignment_3;

import java.util.Scanner;

public class CountingVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().trim().toLowerCase();
		int vowels = 0;
		s=s.replaceAll(" ", "");
		for(int i=0;i<s.length();i++) {
			switch(s.charAt(i)) {
			case 'a':
				vowels++;
				break;
			case 'e':
				vowels++;
				break;
			case 'i':
				vowels++;
				break;
			case 'o':
				vowels++;
				break;
			case 'u':
				vowels++;
				break;
			}
		}
		System.out.println("Count of Vowels : "+vowels);
		System.out.println("Count of Consonants : "+(s.length()-vowels));
	}

}
