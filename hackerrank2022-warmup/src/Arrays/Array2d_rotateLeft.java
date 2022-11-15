package Arrays;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class Array2d_rotateLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 1, 2, 3, 4, 5 };
		int d = 4;

		List<Integer> arrs = Arrays.asList(arr);
		List<Integer> result = rotleft(arrs, d);
		System.out.println(result.toString());

	}

	static List<Integer> rotleft(List<Integer> a, int d) {

		/*
		 * https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?
		 * isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-
		 * kit&playlist_slugs%5B%5D=arrays&h_r=next-challenge&h_v=zen
		 */

		// use list set

		//List<Integer> arrs = Arrays.asList(a);
		//List<Integer> arrs = new ArrayList<>();

		/*
		int len = a.size() - 1;

		for (int i = 0; i < d; i++) {
			int temp = 0;
			for (int j = 0; j < len; j++) {
				if (j == 0) {
					temp = a.get(0);
				}
				a.set(j, a.get(j + 1));
			}

			a.set(len, temp);

			//System.out.println("i : " + i + " -- " + a.toString());
		}
		
		//arrs.addAll(a);
		//System.out.println(arrs.toString());

		return a;
		*/

		// Method 2
		
		/*
		  List<Integer> list1 = new ArrayList<Integer>(); List<Integer> list2 = new
		  ArrayList<>();
		  
		  int k = 0; for (int i = d; i < a.size(); i++) { k = a.get(i); list1.add(k); }
		  System.out.println("list1: " + list1.toString());
		  
		  for(int i = 0 ; i < d; i++) { k = a.get(i); list2.add(k); }
		  
		  System.out.println("list2: " + list2.toString());
		  
		  list1.addAll(list2);
		  
		  return list1;
		  */
		  
		  //Method 3 
			Deque<Integer> deque = new ArrayDeque<>();

			List<Integer> arr1 = new ArrayList<>();

			deque.addAll(a);
			for (int i = 0; i < d; i++) {
				int val = deque.poll(); // retrieve the 1st elment in deque 
				deque.add(val); //add to the tail of deque
			}
			arr1.addAll(deque);

			return arr1;
		 

	}

}
