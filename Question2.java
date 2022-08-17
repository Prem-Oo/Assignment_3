//WAP to reverse a sentence while preserving the position.
//Input : “Think Twice”
//Output : “kniht eciwt”
package assignment_3;

public class Question2 {
	public static void main(String[] args) {
		String st="Think Twice";
		String []s=st.split(" ");
		for(String e:s) {
			String st2="";
			for(int i=e.length()-1;i>=0;i--) {
				st2=st2+e.charAt(i);
				//System.out.println(System.identityHashCode(st2));
			}
			System.out.print(st2+" ");
		}
	}
}
