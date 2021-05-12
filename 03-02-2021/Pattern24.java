package com.assignM01;


/*
 10 9 8 7
 6 5 4
 3 2
 1
 */

public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "";
		int count = 10;
		for (int row = 4; row >= 1; row--) {
			for (int col = row; col >= 1; col--) {
				res += count-- +" ";
			}
			res += "\r";
			
		} // outer close
		System.out.println(res);
	}

}
