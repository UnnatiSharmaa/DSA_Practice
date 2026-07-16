import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];

        // Step 1: Map score to original index
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = score[i]; // score
            arr[i][1] = i;        // original index
        }

        // Step 2: Sort by score descending
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        // Step 3: Assign ranks
        for (int i = 0; i < n; i++) {
            int idx = arr[i][1];
            if (i == 0) ans[idx] = "Gold Medal";
            else if (i == 1) ans[idx] = "Silver Medal";
            else if (i == 2) ans[idx] = "Bronze Medal";
            else ans[idx] = String.valueOf(i + 1);
        }

        return ans;
    }
}
