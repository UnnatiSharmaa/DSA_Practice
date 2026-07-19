class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // overflow avoid karne ke liye

            if (nums[mid] == target) {
                return mid; // target mil gaya
            } else if (nums[mid] < target) {
                left = mid + 1; // right half me search karo
            } else {
                right = mid - 1; // left half me search karo
            }
        }
        return -1; // agar target nahi mila
    }
}
