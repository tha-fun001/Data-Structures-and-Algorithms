package Arrays;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class MinBribes {

	/*
	 * https://www.hackerrank.com/challenges/new-year-chaos/forum?isFullScreen=true&
	 * h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%
	 * 5B%5D=arrays&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
	 */
	public static void main(String[] args) {

		Integer[] q = { 2, 5, 1, 3, 4 };

		List<Integer> arrs = new ArrayList<>();
		arrs = Arrays.asList(q);

		minimumBribes(arrs);

	}

	public static void minimumBribes(List<Integer> q) {

		// Write your code here
		int totBribe = 0;
		for (int i = q.size() - 1; i >= 0; i--) {
			if (q.get(i) != i + 1) {
				if (i - 1 >= 0 && q.get(i - 1) == i + 1) {
					Collections.swap(q, i, i - 1);
					totBribe++;
					
				} else if (i - 2 >= 0 && q.get(i - 2) == i + 1) {
					Collections.swap(q, i - 1, i - 2);
					Collections.swap(q, i - 1, i);
					totBribe += 2;
					
				} else {
					System.out.println("Too chaotic");
					return;
				}

			}

		}
		System.out.println(totBribe);

	}

}
