package com.assignM01;

/*
 1 * 1 * 1
 1 * 1 * 1
 1 * 1 * 1
 1 * 1 * 1
 */
public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "";
		for(int row = 1; row <= 4;row++) {
			for(int column = 1;column <= 5;column++) {
				if(column % 2 == 0) {
					res += "*" + " ";
				}
				else {
					res += "1" + " ";
				}
			}
			res += "\n";
		}
		System.out.println(res);
	}

}
