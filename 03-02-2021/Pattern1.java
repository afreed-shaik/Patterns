package com.assignM01;


/*
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5 */

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "";
		for(int row = 1; row <= 5; row++) {
			for(int column = 1;column <= 5 ; column++) {
				res += column + " ";
			}
			res += "\n";
		}
		System.out.println(res);
	}

}
