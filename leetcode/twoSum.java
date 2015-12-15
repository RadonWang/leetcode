public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] index;
        index = new int[2];
        for (int i = 0; i<length; i++) {
        	int j = i + 1;
        	while(j < length) {
        		if (nums[i] + nums[j] == target) {
        			index[0] = i+1;
        			index[1] = j+1;
        			break;
        		}
        		else j++;
        	}  
        }
        return index;
    }
}