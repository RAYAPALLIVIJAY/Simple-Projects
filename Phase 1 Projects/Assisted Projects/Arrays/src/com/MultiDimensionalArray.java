package com;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][] a = {
	            {1, -5, 8}, 
	            {-2, -7, 6, 4}, 
	            {7}, 
	        };
	      
	        for (int i = 0; i < a.length; ++i) {
	            for(int j = 0; j < a[i].length; ++j) {
	                System.out.println(a[i][j]);
	            }
	        }
	}

}
