package com.assignM01;

import java.util.Scanner;

/*
 * A
 * B C
 * D E F
 * G H I J
 * K L M N O
 */
public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 65;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range:");
		int range = scan.nextInt();
		for(int row = 1; row <= range; row++) {
			
			for(int col = 1; col <= row ; col++) {
				char c = (char)a;
				System.out.print(c + " ");
				
				//count++;
				a++;
			}
			//row++;
			System.out.println();
		}
	}

}
