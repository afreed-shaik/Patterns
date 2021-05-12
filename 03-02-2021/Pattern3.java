package com.assignM01;

/*
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1 
 */


public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "";
		for(int row = 5; row >= 1; row--) {
			for(int column = 5;column >= 1 ; column--) {
				res += column + " ";
			}
			res += "\n";
		}
		System.out.println(res);
	}

}

