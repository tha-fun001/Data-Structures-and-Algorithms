package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Minimum_Swaps_2 {

	/*
	 * https://www.hackerrank.com/challenges/minimum-swaps-2/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
	 */
	public static void main(String[] args) {
		
		int [] arrs = {4,3,1,2};
		int result = minimumSwaps(arrs);
		System.out.println(result);

	}
	
	static int minimumSwaps(int[] arr) {
		
		int count = 0;
		int index = 0;
		
		
		while (index < arr.length) {
			if(arr[index] != (index + 1)) {
				int temp = arr[index];
				arr[index] = arr[arr[index] - 1]; // need the swap slot available
				arr[temp - 1] = temp;
				count++;
				//System.out.println("if: " + Arrays.toString(arr));
			} else {
				break;
				//index++;
				//System.out.println("else: " + Arrays.toString(arr));
			}
		}
		return count;
    }

}
