class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int longest = 0;

        for (int i = 1; i < n - 1; i++) {
            // Check if arr[i] is a peak
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int left = i, right = i;

                // Expand left
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }

                // Expand right
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                // Update longest mountain length
                longest = Math.max(longest, right - left + 1);
            }
        }

        return longest;
    }

    // 🔥 Example usage
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.longestMountain(new int[]{2,1,4,7,3,2,5})); // 5
        System.out.println(sol.longestMountain(new int[]{2,2,2}));         // 0
    }
}
