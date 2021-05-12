package com.assign12;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("Enter Start range to print tables");
		Scanner sc = new Scanner(System.in);
		int start_range = sc.nextInt();
		System.out.println("Enter End range to print tables");
		int end_range = sc.nextInt();
		
		for (int i = start_range; i <= end_range; i++) {
			System.out.println("Table Of "+i+" IS : ");
			for (int j = 1; j <= 10; j++) {
				
				System.out.println(i+" * "+j +" = "+i*j);
				
			}
			System.out.println("<<<<< ****** >>>>>");
		}


	}

}
