import java.util.*;

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);  // sort ascending
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];  // take the smaller element in each pair
        }
        return sum;
    }
}
