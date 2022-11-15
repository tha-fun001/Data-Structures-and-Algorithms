package StringManipulation;

import java.util.Scanner;

public class Special_palindromic_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter a string: ");
		//String input = scanner.nextLine();
		
		String str = "asa";
		
		
		
		int count = 0;
		
		for(int i = 1 ; i < str.length(); i++)
		{
			int low = i;
			int high = i;
			while(str.charAt(low) == str.charAt(high)) {
				low--;
				high++;
				
				if((low == -1) || (high == str.length())){
					break;
				}
			}
			String palindrome = str.substring(low+1, high);
			System.out.println(palindrome);
			if(isPalindrome(palindrome))
			{
				count++;
			}
			
		}
		
		
		System.out.println(count);
		
	}

	static boolean isPalindrome(String s) {
		
		int left = 0;
		int right =  s.length() - 1;
		
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
		
	}
	
	

}
