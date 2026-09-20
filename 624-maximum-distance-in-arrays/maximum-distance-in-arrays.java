class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        // Initialize with first array's min and max
        int minVal = arrays.get(0).get(0);
        int maxVal = arrays.get(0).get(arrays.get(0).size() - 1);
        int result = 0;

        // Iterate from second array onwards
        for (int i = 1; i < arrays.size(); i++) {
            int currMin = arrays.get(i).get(0);
            int currMax = arrays.get(i).get(arrays.get(i).size() - 1);

            // Check distance with previously seen min and max
            result = Math.max(result, Math.abs(currMax - minVal));
            result = Math.max(result, Math.abs(maxVal - currMin));

            // Update global min and max
            minVal = Math.min(minVal, currMin);
            maxVal = Math.max(maxVal, currMax);
        }

        return result;
    }
}
