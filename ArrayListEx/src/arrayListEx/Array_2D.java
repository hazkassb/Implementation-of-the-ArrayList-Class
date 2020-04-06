package arrayListEx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Array_2D {
	
	public void TestCodata() throws FileNotFoundException {
		File file = null;
		BufferedReader bf = new BufferedReader(new FileReader(file));
	}
	
	public static void main(String[] args) {
//		int myArray[2][2][1] = {{00,10},{01,11}};
		
		int[] nums = new int[2];
		System.out.println(Arrays.toString(nums));
		
		
		int[][] test = new int[2][2];
		test[0][0] = 2;
		System.out.println(Arrays.toString(test));
		
	
		
		
	}

}
