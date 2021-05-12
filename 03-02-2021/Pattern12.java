package com.assignM01;

/*
 *
 * *
 * * *
 * * * *
 * * * * *
 */
public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "";
		for(int row = 1; row <= 5; row++) {
			for(int column = 1;column <= row ; column++) {
				res += "*" + " ";
			}
			res += "\n";
		}
		System.out.println(res);
	}

}
