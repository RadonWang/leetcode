public class Solution {
    public int lengthOfLongestSubstring(String s) {
    	int length = 0;
    	int max = 0;
    	int start = 0;
    	int end = 0;
        int originLength = s.length();
        int[] newString = new int[130];
        int[] newSign = new int[130];
        if (s.length()==0) return 0;
        else{
	        for (int i = 0; i < originLength; i++) {
	        	end = i;
	        	char nowLetter = s.charAt(i);
				if (newString[nowLetter] == 0) {
	        		newString[nowLetter]++;
	        		newSign[nowLetter] = i;
	        		length = end - start + 1;
	        		if (max < length) max = length;
	        	}
	        	else {
	        		length = end - start + 1;
	        		start = newSign[nowLetter] + 1;
	        		newString[nowLetter]++;
	        		newSign[nowLetter] = i;
	        		if (max < length) max = length;
	        	}
	        }
	        return length;
	    }
    }
}