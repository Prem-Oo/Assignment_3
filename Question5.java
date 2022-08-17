//WAP to print repeatedly occurring characters in the given String.
package assignment_3;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		StringBuilder sb=new StringBuilder();
		sb.append(sc.nextLine().trim());
		for(int i=0;i<sb.length();i++) {
			boolean flag=false;
			for(int j=i+1;j<sb.length();j++) {
				if(sb.charAt(i)==sb.charAt(j) &&sb.charAt(i)!=' ' ) {
					flag=true;
					sb.deleteCharAt(j);
				}
			}
			if(flag)
				System.out.print(sb.charAt(i)+" ");
		}
	}
		
}
