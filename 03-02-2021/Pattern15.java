package com.assignM01;

/*
 2
 4 6
 8 10 12
 14 16 18 20
 22 24 26 28 30
 */
public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		String res = "";
		for(int row = 1; row <= 5; row++) {
			
			for(int column = 1;column <= row ; column++) {
				
				res += (count++ * 2) + " ";
				;
			}
			
			res += "\n";
		}
		System.out.println(res);
	}

}
