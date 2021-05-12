package com.assignM01;

/*
1
2 3
3 4 5
4 5 6 7
5 6 7 8 9
*/
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int count ;
		String res = "";
		for(int row = 1; row <= 5; row++) {
			count = row;
			for(int column = 1;column <= row ; column++) {
				
				res += count + " ";
				count++;
			}
			
			res += "\n";
		}
		System.out.println(res);
	}
}
