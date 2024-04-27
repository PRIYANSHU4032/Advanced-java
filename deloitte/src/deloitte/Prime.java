package deloitte;

import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num-1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int sum = 0;
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values");
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < 3; j++) {
            if (isPrime(arr[j])) {
                sum += arr[j];
            }
        }
        System.out.println("Sum of prime numbers: " + sum);
    }
}
