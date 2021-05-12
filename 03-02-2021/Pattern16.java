package com.assignM01;

/*
 0
 0 1
 0 1 2
 0 1 2 3
 0 1 2 3 4
 */

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "";
		for(int row = 0; row <= 4; row++) {
			for(int column = 0;column <= row ; column++) {
				res += column + " ";
			}
			res += "\n";
		}
		System.out.println(res);
	}

}
