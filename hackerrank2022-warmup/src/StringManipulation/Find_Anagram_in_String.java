package StringManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Anagram_in_String {

	/*
	 * Find all Anagram in a String - https://www.youtube.com/watch?v=fvEw13A5O1o
	 * 
	 * Input s : "cbaebabacd" p: "abc" output [0,6] explanation: The substring with
	 * startIndex = 0 is "cba" , which is an anagram of "abc" The substring with
	 * startIndex = 6 is "bac" , which is an anagram of "abc'
	 */

	public static void main(String[] arg) {

		String s = "abcdebacb";
		String p = "cab";

		List<Integer> result = new ArrayList<>();
		result = findAnagrams(s, p);
		System.out.println(result.toString());
	}

	public static List<Integer> findAnagrams(String s, String p) {

		List<Integer> result = new ArrayList<>();

		if (s.length() == 0 || s == null) {
			return result;
		}
		
		int [] phash = new int[26];
		int [] shash = new int[26];
		
		
		int window = p.length();
		int left = 0;
		int right = 0;
		int len = s.length();
		
		if(len < window) {
			return result;
		}
		
		//below loop is for only the 1st slide windows
		while(right < window) {
			phash[p.charAt(right) - 'a']++;
			shash[s.charAt(right) - 'a']++;
			right++;
		}
		
		right--;
		System.out.print(Arrays.toString(phash) + " ");
		System.out.println();
		System.out.print(Arrays.toString(shash) + " " + right);
		System.out.println();
		
		//loop the windows to the rest of the String s
		while(right < len) {
			if(compare(phash,shash)) {
				result.add(left); // add the index
			}
			
			right++;
			if(right != len) {
				shash[s.charAt(right) - 'a']++;
			}
			shash[s.charAt(left) - 'a']--;
			left++;
		}
		
		return result;
	}

	static boolean compare(int[] phash, int[] shash) {
	
		//convert the int[] into Integer ArrayList so we can do compare.
		List<Integer> p_arrays = new ArrayList<Integer>(phash.length);
		List<Integer> s_arrays = new ArrayList<Integer>(shash.length);
		
		for(int i : phash) {
			p_arrays.add(i);
		}
		for(int i : shash) {
			s_arrays.add(i);
		}
		
		return p_arrays.equals(s_arrays)? true : false;		
				
		
	}

}
