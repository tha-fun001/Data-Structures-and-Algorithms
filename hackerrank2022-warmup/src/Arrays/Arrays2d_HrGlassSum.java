
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays2d_HrGlassSum {

	/*
	 * https://www.hackerrank.com/challenges/2d-array/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer [][] arr = {
				{1, 1, 1, 0, 0, 0},
				{0, 1, 0, 0, 0, 0},
				{1, 1, 1, 0, 0, 0},
				{0, 0, 2, 4, 4, 0},
				{0, 0, 0, 2, 0, 0},
				{0, 0, 1, 2, 4, 0}
		};
		
		
		//below is double array list
		List<List<Integer>> arrs = new ArrayList<List<Integer>>();
		
		for (int i = 0 ; i < arr[0].length; i++) {
			
				arrs.add(i, Arrays.asList(arr[i]));
		}
		//print
		for (int i = 0; i < 6; i++)
		{
			System.out.print(arrs.get(3).get(i).toString());
		}
		System.out.println();
	
		int result = hrGlassSum(arrs);
		System.out.println(result);
	

	}

	private static int hrGlassSum(List<List<Integer>> arr) {
		
		int greatestSum = Integer.MIN_VALUE;
		int Count = 16;
		
		for (int x = 0; x < arr.size() - 2; x++)
	    {
	        for (int y = 0; y < arr.get(x).size() - 2; y++)
	        {
	            int currentSum = 0;

	            currentSum += arr.get(x).get(y); //top left
	            currentSum += arr.get(x).get(y + 1); //top middle
	            currentSum += arr.get(x).get(y + 2); //top right

	            currentSum += arr.get(x + 1).get(y + 1); //middle

	            currentSum += arr.get(x + 2).get(y); //bot left
	            currentSum += arr.get(x + 2).get(y + 1); //bot middle
	            currentSum += arr.get(x + 2).get(y + 2); //bot right

	            if (currentSum > greatestSum)
	                greatestSum = currentSum;
	        }
	    }
	    return greatestSum;
		
	}

}
