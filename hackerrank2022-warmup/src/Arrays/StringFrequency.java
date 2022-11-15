package Arrays;

import java.util.ArrayList;
import java.util.List;


public class StringFrequency {

	public static void main(String[] args) {

		String s = "aba";
		long n = 10;
		//long result = repeatedString(s, n);
		long result = repeatedString2(s,n);
		System.out.println(result);

	}
	
	static long repeatedString2(String s, long n) {
		
		long size = s.length();
		long count = 0;
		
		for(int i = 0; i < size; i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}
		
		long count1 = 0;
		long remainder = n % size;
		
		System.out.println("remainder: " + remainder + " n: " + n + " size: " + size);
		
		for (int i= 0; i < remainder ; i++) {
			if (s.charAt(i) == 'a') {
				count1++;
			}
		}
		
		long multiple = n / size;
		
		return (multiple * count) + count1;
	}

	static long repeatedString(String s, long n) {

		long count = 0;
		int size = (int)n + 10;
		
			//List<Character> list = new ArrayList<>(3);
			ArrayList<Character> list =new ArrayList<Character>();
			list.ensureCapacity(size);
			
			
			for (int i = 0, j = 0; i <= n; i++) {

				if (j < s.length()) {
					list.add(s.charAt(j));
					j++;
				} else {
					j = 0;
				}

				if (i == n && j == s.length())
				{
					j = 0;
					list.add(s.charAt(j));
				}
				
			}

			System.out.println(list);

			for (Character a : list) {
				if (a.charValue() == 'a') {
					count++;
				}
			}
		

		return count;
	}

}
