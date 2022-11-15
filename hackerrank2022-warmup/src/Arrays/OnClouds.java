package Arrays;

import java.util.ArrayList;
import java.util.List;



public class OnClouds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> c = new ArrayList<>();
		c.add(0);
		c.add(1);
		c.add(0);
		c.add(0);
		c.add(0);
		c.add(1);
		c.add(0);
		
		int jumpresult = jumpingOnClouds(c);
		System.out.println(jumpresult);
	}

	static int jumpingOnClouds(List<Integer> c) {
		// TODO Auto-generated method stub
		
		int indexcount = c.size() - 1;
		int jump = 0;
		
		for(int i = 0; i < indexcount; i++)
		{
			if(i+2 <= indexcount && 0 == c.get(i+2)) {
				i++;
			}
			jump++;
		}
		return jump;
		
	}

}
