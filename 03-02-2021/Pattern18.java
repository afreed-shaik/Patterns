package com.assignM01;

/*
 16 15 14 13
 12 11 10 9
 8 7 6 5
 4 3 2 1
 */
public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "";
		int count = 16;
		for(int row = 1; row <= 4 ; row++) {
			for(int column = 1; column <= 4;column++) {
				res += count-- + " ";
				if(count % 4 == 0) {
					res += "\n";
				}
				
			}
			
		}
		System.out.println(res);
	}

}
