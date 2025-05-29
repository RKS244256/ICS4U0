package Homework;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

class Container_Review{
	public static int[][] shift(int[][] nia, int k){
		int[][] o = new int[nia.length][nia[0].length];
		int w = 0;
		for(int i = 0; i<nia.length; i++){
			for(int ni = 0; i<o[0].length; ni++){
				o[i][(ni+k)-(Math.floorDiv(ni+k, nia[0].length)*nia[0].length)] = nia[i][ni];
				System.out.println(Arrays.deepToString(o));
			}
		}
		return o;
	}
	public static void main(String[] args){
		int[][] ints = {{1,2,3}, {4,5,7}};
		System.out.println(Arrays.deepToString(shift(ints, 4)));
	}
}
