class Solution {
    public int minPatches(int[] nums, int n) {
        long miss = 1;   // smallest number we cannot form yet
        int i = 0;       // index in nums
        int patches = 0; // count of patches added

        while (miss <= n) {
            if (i < nums.length && nums[i] <= miss) {
                // extend coverage using nums[i]
                miss += nums[i];
                i++;
            } else {
                // patch with 'miss' itself
                miss += miss;
                patches++;
            }
        }
        return patches;
    }
}
