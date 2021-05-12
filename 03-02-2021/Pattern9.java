package com.assignM01;

/*
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 */
public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		String res = "";
		for(int row = 1; row <= 5; row++) {
			
			for(int column = 1;column <= row ; column++) {
				
				res += count++ + " ";
				;
			}
			
			res += "\n";
		}
		System.out.println(res);
	}

}
