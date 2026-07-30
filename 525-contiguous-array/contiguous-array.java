import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        // prefix sum where 0 -> -1, 1 -> +1
        int prefixSum = 0;
        int maxLen = 0;
        
        // map: prefixSum -> earliest index
        HashMap<Integer, Integer> seen = new HashMap<>();
        seen.put(0, -1); // base case
        
        for (int i = 0; i < nums.length; i++) {
            prefixSum += (nums[i] == 1 ? 1 : -1);
            
            if (seen.containsKey(prefixSum)) {
                maxLen = Math.max(maxLen, i - seen.get(prefixSum));
            } else {
                seen.put(prefixSum, i);
            }
        }
        
        return maxLen;
    }
}
