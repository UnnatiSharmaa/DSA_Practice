class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0; // count modifications

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) { 
                count++;
                if (count > 1) return false;

                // Fix either nums[i-1] or nums[i]
                if (i - 2 < 0 || nums[i] >= nums[i - 2]) {
                    nums[i - 1] = nums[i]; // lower previous
                } else {
                    nums[i] = nums[i - 1]; // raise current
                }
            }
        }
        return true;
    }
}
