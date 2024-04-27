package deloitte;

import java.util.Scanner;

public class palin {
	public static boolean isPalind(String str) {
		int n = str.length();
		for(int i=0;i<n/2;i++) {
			if(str.charAt(i)!= str.charAt(n-i-1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("palindrome is "+isPalind(str));
	}
}
