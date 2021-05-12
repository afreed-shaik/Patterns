package com.assignM01;

import java.util.Scanner;

public class Collatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any Numbers");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String res = num+" : ";
		while(num > 1) {
			if (num % 2 == 0) {
				num = num / 2;
			}
			else {
				num = (num * 3) + 1;
			}
			res += num +" ";
		}
		System.out.println(res);
	}

}
