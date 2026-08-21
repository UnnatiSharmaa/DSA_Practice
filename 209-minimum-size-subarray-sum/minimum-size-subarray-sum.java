class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum += nums[right];  // expand window

            // shrink window until sum < target
            while (sum >= target) {
                int length = right - left + 1;
                if (length < minLen) {
                    minLen = length;
                }
                sum -= nums[left];
                left++;
            }
        }

        // traditional return style
        if (minLen == Integer.MAX_VALUE) {
            return 0;
        } else {
            return minLen;
        }
    }
}
