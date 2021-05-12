package com.assignM01;


/*
 1 1 1 1
 0 0 0 0
 1 1 1 1
 0 0 0 0
 */
public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "";
		for(int row = 1; row <= 4 ; row++) {
			for(int column = 1; column <= 4;column++) {
				if(row % 2 == 0) {
					res += "0" + " ";
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
