package deloitte;

import java.util.Scanner;

public class Oddone{
	public static int getOdd(int arr[]) {
	    int sqsum = 0;
	    for(int i = 0; i < arr.length; i++) {
	        for(int j = arr.length-1 ; j >= 0; j--) {
	            if(arr[i] % 2 != 0) {
	               if(arr[j]%2!=0) {
	            	   sqsum = (arr[i] * arr[i]) + (arr[j] * arr[j]);
		                return sqsum; // Exit the method once you find the pair
	               }
	            }
	        }
	    }
	    return sqsum; // Return 0 if no pair is found
	}

	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("enter the value: ");
		for(int i =0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(getOdd(arr));
	}
}