
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {

	/*
	 * https://www.hackerrank.com/challenges/crush/problem?isFullScreen=true&h_l=
	 * interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D
	 * =arrays&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-
	 * challenge&h_v=zen&h_r=next-challenge&h_v=zen
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [][] arr = {
				{1, 2, 100},
				{2, 5, 100},
				{3, 4, 100}
		};
		//below is double array list
		
		
		List<List<Integer>> arrs  = new ArrayList<List<Integer>>();
		
		for(int i = 0; i < arr.length; i++) {
			arrs.add(i, Arrays.asList(arr[i]));
		}
		
		long result = arrayManipulation(5, arrs);
		System.out.println("result: " + result);

	}

	public static long arrayManipulation(int n, List<List<Integer>> queries) {
		// Write your code here
		
		
		long currentVal = 0;
		long maxVal = Long.MIN_VALUE;
		
		
		long [] result = new long[n];	
		long current = 0;
		
		for(int i = 0; i < queries.size(); i++)
		{
			
				int start = queries.get(i).get(0) - 1;
				int end = queries.get(i).get(1) - 1;
				int add = queries.get(i).get(2);
				
				System.out.println(start + " " + end + " " + add);
				
				result[start] = result[start] + add;
				
				//check out of bound error
				if(end + 1 < n) {
					result[end + 1] = result[end + 1] - add;
				}
		}
		
		System.out.println(Arrays.toString(result));
		for (int i = 0; i < n; i++)
		{
			//result[i] = result[i] + result[i-1];
			//maxVal = Math.max(maxVal, result[i]);
			current = current + result[i];
			if(current > maxVal) {
				maxVal = current;
			}
			
		}
		return maxVal;

	}

}
