package deloitte;

import java.util.Scanner;

public class Spacestring {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str ="";
		System.out.println("Enter the string: ");
		String stu = sc.nextLine();
		for(int i =0;i<stu.length();i++) {
			str = str+" "+stu.charAt(i);
		}
		System.out.println("your string "+str);
	}

}
