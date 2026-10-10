import java.util.*;

class Solution {
    public int countWays(List<Integer> nums) {
        Collections.sort(nums);
        int n = nums.size();
        int ways = 0;

        // Case 1: select 0 students
        if (nums.get(0) > 0) {
            ways++;
        }

        // Case 2: select all students
        if (nums.get(n - 1) < n) {
            ways++;
        }

        // Case 3: select k students (1 <= k < n)
        for (int k = 1; k < n; k++) {
            if (nums.get(k - 1) < k && nums.get(k) > k) {
                ways++;
            }
        }

        return ways;
    }
}
