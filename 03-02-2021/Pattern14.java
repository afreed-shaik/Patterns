package com.assignM01;

/*
 * * * * *
 *       *
 *       *
 *       *
 * * * * *      
 */
public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "";
		for(int row = 1; row <= 5;row++) {
			for(int column = 1;column <= 5;column++) {
				if(row == 1 || row == 5 || column == 1 || column == 5) {
					res += "*" + " ";
				}
				else {
					res += " " + " ";
				}
			}
			res += "\n";
		}
		System.out.println(res);
	}

}
