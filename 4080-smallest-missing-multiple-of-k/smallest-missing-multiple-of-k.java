import java.util.*;

class Solution {
    public int missingMultiple(int[] nums, int k) {
        // Store all numbers in a HashSet for fast lookup
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Start checking multiples of k
        int multiple = k;
        while (true) {
            if (!set.contains(multiple)) {
                return multiple; // Found the missing multiple
            }
            multiple += k;
        }
    }
}
