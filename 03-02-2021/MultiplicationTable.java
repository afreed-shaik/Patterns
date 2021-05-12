package com.assignM01;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int start_value = sc.nextInt();
		int end_value = sc.nextInt();
		String res = "";
		
		for (int j = start_value; j <= end_value; j++) {
			for (int i = 1; i <= 10; i++) {
				res += j+" * "+i+" = "+(j * i)+" \r"; 
			}
			res += "-----------------------------------------\r";
		}
		
		System.out.println(res);
	}

}
