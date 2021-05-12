package com.assignM01;


/*
     1
    1 1
   1 1 1
  1 1 1 1
 1 1 1 1 1
 */
public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "";
		int row,col;
		for ( row = 1; row <= 5; row++) {
			for ( col = row; col <= 5; col++) {
				res += " ";
			}
			for (int star = 1; star <= row; star++) {
				res += "1 ";
			}
			res +="\r";
		}
		System.out.println(res);
	}

}
