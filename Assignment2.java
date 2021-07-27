package Assignment2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Assignment2 {

	
	
	public static void main(String[] args) {
		
		Random random = new Random();
		Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
		Set<Integer> values = new HashSet<Integer>(Arrays.asList(0,1,2,3,4,6));
		int totalRun = 0;
		
		for(int i=1;i<=30;i++) {
			int dummy =random.nextInt(7);
			
			if(values.contains(dummy)){
				
			
			
			Integer count = freq.get(dummy);
			
			if(count==null) {
				freq.put(dummy, 1);
			}else {
				freq.put(dummy, count + 1);
			}
			
			totalRun = totalRun+dummy;
			

			}
	}
		
		System.out.println("Number of 0s, 1s, 2s, 3s, 4s and 6s "+ freq.toString());
		System.out.println(totalRun);
		System.out.println("Strike Rate is "+ totalRun/30);


	}
}
