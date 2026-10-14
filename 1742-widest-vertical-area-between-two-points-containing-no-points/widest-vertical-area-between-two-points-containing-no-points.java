import java.util.*;

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int[] xVals = new int[n];
        
        // Step 1: Extract x-coordinates
        for (int i = 0; i < n; i++) {
            xVals[i] = points[i][0];
        }
        
        // Step 2: Sort x-coordinates
        Arrays.sort(xVals);
        
        // Step 3: Find max gap
        int maxGap = 0;
        for (int i = 1; i < n; i++) {
            maxGap = Math.max(maxGap, xVals[i] - xVals[i - 1]);
        }
        
        return maxGap;
    }
}
