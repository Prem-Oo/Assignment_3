//WAP to check if the String is a Pangram or not.
package assignment_3;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwxyz";
		char []c=s.toCharArray();
		Scanner sc =new Scanner(System.in);
		String st=sc.nextLine().toLowerCase();
		for(int i=0;i<26;i++) {
			int j=0;
			for(j=0;j<st.length();j++) {
				if(c[i]==st.charAt(j)) {
					break;
				}	
			}
			if(j==st.length()) {
				System.out.println(st+" : is not Panagram");
				System.exit(0);
			}
		}
		System.out.println(st+" : is Panagram");
		
	}

}
