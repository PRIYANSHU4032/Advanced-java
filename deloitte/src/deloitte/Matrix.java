package deloitte;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		int m = arr.length;
		int n = arr[0].length;
		int arr2[][] = new int[3][3];
		int x = arr2.length;
		int y = arr2[0].length;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		for(int i=0;i<m;i++) {
			for(int j =0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//for(int i=0;i<m;i++) {
		//	for(int j =0;j<n;j++) {
		//		System.out.print(arr[i][j]+" ");
		//	}
		//	System.out.println();
		//}
		
		System.out.println("Enter the value: ");
		for(int i=0;i<x;i++) {
			for(int j =0;j<y;j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		         for(int i=0;i<m;i++) {
					for(int j =0;j<n;j++) {
						System.out.print(arr[i][j]+arr2[i][j]+" ");
					}
					System.out.println();
				}
	

	}

}
