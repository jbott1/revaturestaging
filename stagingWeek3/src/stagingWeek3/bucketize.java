package stagingWeek3;

import java.util.ArrayList;

public class bucketize {

	public static void main(String[] args) {

		String str = "she sells sea shells by the sea";
		
		
		bucketize(str, 10);
		
		
		
		
		
		
		
		

	}
	
	
	public static ArrayList<String> bucketize(String str, int size) {
		
		
		ArrayList<String> bucketized = new ArrayList<String>();
		String[] words = str.split(" ");
		
		
		
		for (int i = 0; i < words.length; i++) {

			if(words[i].length() <= size) {
				if (( i + 1) <= words.length && ((words[i].length() + words[i+1].length()) <= size)) {
					
					bucketized.add(words[i] + " " + words[i+1]);
					
				}
				
				
			}
			
			
			
		}
		
		
		
		
		
		return bucketized;
	}

}
