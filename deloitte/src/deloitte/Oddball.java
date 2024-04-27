package deloitte;

import java.util.Scanner;

public class Oddball {
	public static void main(String args[]) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for(int i =0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j]%2 != 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
