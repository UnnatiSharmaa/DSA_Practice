class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;

        // Interleave x and y parts
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];     // x_i
            result[index++] = nums[i + n]; // y_i
        }

        return result;
    }
}
