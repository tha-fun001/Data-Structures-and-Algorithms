package StringManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Sherlock_ValidString {

	/*
	 * https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s = "aaabbbbcccde";
		//String s = "abc";
		//String s = "abccc";
		//String s = "aabbccddeefghi";
		String s= "aabccdd";
		
		isValid4(s);
		
	}
	static String isValid4(String s) {
		
		/*
		 * https://www.youtube.com/watch?v=TidC-dG9C3s
		 */
		Map<Character,Integer> charFreqMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int freq = charFreqMap.getOrDefault(c,0);
			charFreqMap.put(c, freq+1);
		}
		
		System.out.println(charFreqMap.toString());
		int [] arr = new int[charFreqMap.size()];
		int idx = 0;
		
		/*
		Collection<Integer> values = charFreqMap.values();
		Iterator<Integer> it = values.iterator();
		while(it.hasNext()) {
			arr[idx] = it.next();
			idx++;
		}
		*/
		
		/*
		Set<Character> key_set = charFreqMap.keySet();
		for(Character ch: key_set) {
			arr[idx] = charFreqMap.get(ch);
			idx++;
		}
		
		*/
		
		Set<Map.Entry<Character,Integer>> keys = charFreqMap.entrySet();
		for(Map.Entry<Character, Integer> map: keys) {
			arr[idx] = map.getValue();
			idx++;
		}
		
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		
		//Condition 1: All frequency are the same
		//Condition 2: All the same, only one frequency is 1
		//Condition 3: All frequency are same, only one is higher by 1
		int first = arr[0];
		int second = arr[1];
		int secondLast = arr[arr.length - 2];
		int last = arr[arr.length -1];
		
		
		//if the first and last are the same, then all frequencies are the same
		if (first == last) {
			return "YES";
		}
		
		//if first is 1, and all other characters have 1 frequency
		if(first == 1 && second == last) {
			return "YES";
		}
		
		//if all are the same and last characters has just 1 extra count
		if(first == second && second == secondLast && secondLast == (last - 1)) {
			return "YES";
		}
		
		//Else Invalid string
		
		return "NO";
	
		
		
	}
	static String isValid3(String s) {
		
		//insert String into hashmap
		Map<Character,Integer> map = new HashMap<>();
		
		char[] chars = s.toCharArray();
		for(Character c : chars) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		//get a list of value
		List<Integer> list = new ArrayList<>(map.values());
		
		Collections.sort(list);
		int min = list.get(0);
		int max = list.get(list.size() - 1);
		
		if(min == max) {
			return "YES";
		}
		
		int minCount = 0;
		int maxCount = 0;
		
		for(int val: list) {
			if(min == val)
			{
				minCount++;
			}
			if(max == val) {
				maxCount++;
			}
		}
		
		if(max - min > 1) {
			if(minCount != 1) {
				return "NO";
			}
		}
		
		if((maxCount + minCount == list.size()) && ((maxCount < 2) || minCount < 2)) {
			return "YES";
		}
		else {
			return "NO";
		}
		
		
	}

	

	public static String isValid(String s) {
		// Write your code here

		Map<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < s.length() ; i++) {
			char key = s.charAt(i);
			if(map.get(key) != null) {
				map.put(key, map.get(key) + 1);
			}
			else
			{
				map.put(key, 1);
			}
		}
		
		ArrayList<Integer> mapValues = new ArrayList<>(map.values());
		mapValues.ensureCapacity(26);
		
		int max = Collections.max(mapValues);
		int min = Collections.min(mapValues);
		
		if (max == min) {
			return "YES";
		}
		
		int min_count = 0;
		int max_count = 0;
		
		for(int i = 0; i < mapValues.size(); i++) {
			if(mapValues.get(i) == max) {
				max_count++;
			}
			else if(mapValues.get(i) == min) {
				min_count++;
			}
		}
		
		return ((min_count == 1) || (max_count == 1 && max == min+1))? "YES" : "NO";
		
		
	}
}
