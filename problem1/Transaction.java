package dsa.labassignment2.problem1;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");

		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter the values of array");
		
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total number of targets need to be achieved");
		int TargetAmount = sc.nextInt();
		while (TargetAmount-- != 0) {
			int flag = 0;
			long Target;
			System.out.println("Enter the values of target");
			Target = sc.nextInt();
			long sum = 0;
			int j;
			for (j = 0; j < size; j++) {
				sum += arr[j];
				if (sum >= Target) {
					System.out.println("Target achieved after " + (j + 1) + "transactions");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Given target is not achieved");
			}
		}

	}
}
