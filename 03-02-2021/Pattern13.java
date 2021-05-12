package com.assignM01;

import java.util.Scanner;

/*
     *
    * *
   * * *
  * * * *
 * * * * *
 */
public class Pattern13 {

	public static void main(String[] args) {

		String res = "";
		for(int row = 1; row <= 5;row++) {
			for(int space = 1;space <= 5 - row; space++) {
//				System.out.print(" " + " ");
				res += " " + " ";
			}
			for(int diag = 1 ; diag <= (2 * row) - 1;diag++) {
//				System.out.print("*" + " ");
				res += "*" + " ";
			}
			res += "\n";
			
		}
		System.out.println(res);
	}

}
