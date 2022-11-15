package StringManipulation;

public class Making_Anagrams {

	/*
	 * https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
	 */
	public static void main(String[] arg) {
		String a = "cde";
		String b = "abc";

		int result = makeAnagram(a, b);
		System.out.println(result);

	}

	public static int makeAnagram(String a, String b) {
		// Write your code here

		
		int min_deletions = 0;
		int [] a_frequencies = new int[26];
		int [] b_frequencies = new int[26];
		
		for(int i = 0; i < a.length(); i++) {
			char current_char = a.charAt(i);
			int char_to_int = (int) current_char;
			int position = char_to_int - (int)'a';
			a_frequencies[position]++;
			
		}
		
		for(int i = 0; i < b.length() ; i++) {
			char current_char = b.charAt(i);
			int char_to_int = (int) current_char;
			int position = char_to_int - (int)'a';
			b_frequencies[position]++;
		}
		
		for (int i = 0 ; i < 26 ; i++) {
			//to verify the Anagram both a&b frequency must be
			int differnce = Math.abs(a_frequencies[i] - b_frequencies[i]);
			System.out.println("differnce: " + differnce);
			min_deletions += differnce;
			
		}
		
		return min_deletions;
		
		
	}

}
