package com.assignM01;

/*
 5 4 3 2 1
 10 9 8 7 6
 15 14 13 12 11
 20 19 18 17 16
 25 24 23 22 21
 */
public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "";
		int row,col,count = 5;
		for ( row = 1; row <= 5; row++) {
			int flag = count;
			for ( col = 1; col <= 5; col++) {
				res += flag-- +" ";
			}
			count = count + 5;
			res +="\r";
		}
		System.out.println(res);
	}

}
