package com.assign12;

import java.util.Scanner;

public class PrimeNumWIRange {

	public static void main(String[] args) {
		System.out.println("Enter Start range to print PrimeNumbers");
		Scanner sc = new Scanner(System.in);
		int start_range = sc.nextInt();
		System.out.println("Enter End range to print PrimeNumbers");
		int end_range = sc.nextInt();
		
		
		for (int i = start_range; i <= end_range; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				
				if (i % j == 0) 
					 count++;						
				
			}
			
			if(count == 0) {
				System.out.print(i+" ");
			}
			
		}

	}

}
