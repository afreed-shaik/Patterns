package com.assignM01;


/*
 1 1 1 1
 1     1
 1     1
 1 1 1 1
 */
public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "";
		for(int row = 1; row <= 4;row++) {
			for(int column = 1;column <= 4;column++) {
				if(row == 1 || row == 4 || column == 1 || column == 4) {
					res += "1" + " ";
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
