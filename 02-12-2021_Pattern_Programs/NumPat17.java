package com.assign12;

import java.util.Scanner;

public class NumPat17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any value:");
		int range = scan.nextInt();
		int count = 10;
		
		for (int row = 1; row <= range; row++) {
			for (int col = 1; col <= row; col++) {
				
				System.out.print(" " + " ");
			}
			
			for (int num = 1; num <= range - row; num++) {
				System.out.print(count + " ");
				count--;
			}
			System.out.println();
		}

	}

}
