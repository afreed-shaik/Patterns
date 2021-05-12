package com.assignM01;

/*
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5
*/
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "";
		for(int row = 1; row <= 5; row++) {
			for(int column = 1;column <= 5 ; column++) {
				res += row + " ";
			}
			res += "\n";
		}
		System.out.println(res);
	}

}
