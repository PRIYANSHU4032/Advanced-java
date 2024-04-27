package deloitte;

import java.util.Scanner;

public class Substr {
	public static String subSt(String str,int st,int ei) {
		String sub = "";
		for(int i=st;i<ei;i++) {
			sub = sub+str.charAt(i);
		}
		return sub;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(subSt(str,2,4));
	}
}
