package com.assignM01;

/*
5 5 5 5 5
4 4 4 4 4
3 3 3 3 3
2 2 2 2 2
1 1 1 1 1 
 */


public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "";
		for(int row = 5; row >= 1; row--) {
			for(int column = 5;column >= 1 ; column--) {
				res += row + " ";
			}
			res += "\n";
		}
		System.out.println(res);
	}

}

