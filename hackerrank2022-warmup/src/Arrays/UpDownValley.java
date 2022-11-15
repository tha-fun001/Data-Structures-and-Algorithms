package Arrays;

public class UpDownValley {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "DDUUUUUDD";
		int steps = path.length();

		int result = countingValleys(steps, path);
		System.out.println("result: " + result);
	}

	static int countingValleys(int steps, String path) {

		int sea_level = 0;
		int entry_valley  = 0;
		
		char [] chars = path.toCharArray();
		for(char a : chars) {
			if(a == 'U') {
				sea_level++;
				if(sea_level == 0)
				{
					entry_valley++;
				}
				
			}
			else
			{
				sea_level--;
			}
		}
		
		return entry_valley;
		
		/*
		for (int i = 0; i < path.length(); i++) {
			
			char ch = path.charAt(i);
			if(ch == 'U') {
				sea_level++;
				if(sea_level == 0)
				{
					entry_valley++;
				}
				
			}
			else
			{
				sea_level--;
			}
			
		}

		return entry_valley; */
	}

}
