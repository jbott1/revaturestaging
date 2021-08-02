package stagingWeek1;

import java.util.Scanner;

public class problem1 {

	/*
	 * Problem 1: Given two Strings A and B. Find the length of the Longest Common
	 * Subsequence (LCS) of the given Strings. Input: A = Minneapolis, B =
	 * Minnesota.
	 * 
	 * Problem 2: Write java Program to Find Smallest and Largest Element in an
	 * Array. Note: Number can not be repeated in the array.
	 * 
	 * For example: 1 2 3 4 5 6
	 * 
	 * int[] arr1={7,5,6,1,4,2}; Missing number : 3 int[] arr2={5,3,1,2}; Missing
	 * number : 4
	 * 
	 * Logical Reasoning: 3) This question is based on a certain code language.
	 * Understand the logic in the coding and answer the following question.
	 * 
	 * If PROCESSOR is coded as D4F3C5C1E1S1S1E3C6, what is the code for QUADRANT?
	 * 
	 * 
	 */

	
	// assumes positive ints
	public static void largestSmallest(int [] arr) {
		
		String result = "";
		
		
		int max = 0;
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
				
			}
			
			if(arr[i] < min) {
				min = arr[i];
				
			}
			
		}
		
		result = "Largest int: " + max + " Smallest: " + min;
		
		System.out.println(result);
	}
	
	
	public static String longestSubstring(String a, String b) {

		int m = a.length();
		int n = b.length();

		int max = 0;

		int[][] dp = new int[m][n];

		int endIndex = -1;

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {

				if (a.charAt(i) == b.charAt(j)) {

					if (i == 0 || j == 0) {
						dp[i][j] = 1;
					} else {

						dp[i][j] = dp[i - 1][j - 1] + 1;
					}

					if (max < dp[i][j]) {
						max = dp[i][j];
						endIndex = i;
					}
				}

			}
		}
		return a.substring(endIndex - max + 1, endIndex + 1);
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("input first string: ");
		String str1 = in.nextLine();
		System.out.println("input second string: ");
		String str2 = in.nextLine();

		String result = longestSubstring(str1, str2);
		System.out.println(result);

		int [] arr = {1,2,3,4,5,6};
		
		largestSmallest(arr);
		
		
		
		
		
	}

}
