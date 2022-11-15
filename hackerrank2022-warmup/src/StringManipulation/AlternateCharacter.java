package StringManipulation;

public class AlternateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int alternatingCharacters(String s) {
		// Write your code here
		int min_deletion = 0;
		
		for(int i = 0; i < s.length() -1; i++) {
			if (s.charAt(i) == s.charAt(i+1)) {
				min_deletion++;
			}
		}
		
		return min_deletion;

	}

}
