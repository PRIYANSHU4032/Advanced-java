package deloitte;

import java.util.Scanner;

public class Eve {

	public static void main(String[] args) {
		
		        int sum = 0;
		        Scanner sc = new Scanner(System.in);
		        System.out.println("enter the value");
		        int arr[] = new int[5];
		        for(int i =0;i<5;i++){
		            arr[i] = sc.nextInt();
		            
		        }
		        for(int j =0;j<5;j++) {
                        if(arr[j]%2 == 0) {
		            	
		            	sum = sum + arr[j];
		            	
		            }
		            
		        }
		        System.out.println(sum);
		        
		    }
		

		// TODO Auto-generated method stub

	}


