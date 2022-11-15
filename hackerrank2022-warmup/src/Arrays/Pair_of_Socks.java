package Arrays;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Pair_of_Socks {

	/*
	 * Complete the 'sockMerchant' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER n 2. INTEGER_ARRAY ar
	 */

	public static int sockMerchant(int n, List<Integer> ar) {
		// Write your code here
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer item : ar) {
			if (map.containsKey(item)) {
				int count = map.get(item) + 1;
				map.put(item, count);
			} else {
				map.put(item, 1);
			}
		}

		Set<Integer> keys = map.keySet();
		// System.out.println(keys.toString());
		int result = 0;
		for (Integer key : keys) {

			int pair = map.get(key) / 2;

			result = result + pair;
			System.out.println(key + " : " + map.get(key));
		}
		return result;
	}

	public static void main(String[] args) {

		int n = 9;
		List<Integer> ar = new ArrayList<>();

		ar.add(10);
		ar.add(20);
		ar.add(20);
		ar.add(10);
		ar.add(10);
		ar.add(30);
		ar.add(50);
		ar.add(10);
		ar.add(10);
		ar.add(10);
		ar.add(20);

		System.out.println(ar.toString());
		int result = sockMerchant(n, ar);
		System.out.println("result: " + result);

	}

}
