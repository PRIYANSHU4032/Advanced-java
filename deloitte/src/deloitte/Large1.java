package deloitte;

import java.util.Scanner;

public class Large1 {
	public static int isLarge(int arr[]) {
		int max = 0;
		for(int i =0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int lowest(int arr[]) {
		int min = 0;
		min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter the value");
		for(int i = 0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
			
		}
		System.out.println(isLarge(arr));
		System.out.println(lowest(arr));
				
	}

}
