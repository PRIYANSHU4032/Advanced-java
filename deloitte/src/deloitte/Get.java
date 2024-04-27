package deloitte;

import java.util.Scanner;

public class Get {
	public static void numGet(String str) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)== '1' || str.charAt(i)== '2'|| str.charAt(i)== '3'||str.charAt(i)== '4'|| str.charAt(i)== '5'|| str.charAt(i)== '6'|| str.charAt(i)== '7'|| str.charAt(i)== '8'|| str.charAt(i)== '2'|| str.charAt(i)== '0') {
				System.out.println(str.charAt(i));
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		numGet(str);
	}

}
