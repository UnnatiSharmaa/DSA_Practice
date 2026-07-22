import java.util.*;

class Solution {
    public int maxStarSum(int[] vals, int[][] edges, int k) {
        int n = vals.length;
        
        // Build adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(vals[edge[1]]);
            graph.get(edge[1]).add(vals[edge[0]]);
        }
        
        int maxSum = Integer.MIN_VALUE;
        
        // For each node, calculate star sum
        for (int i = 0; i < n; i++) {
            List<Integer> neighbors = graph.get(i);
            // Sort neighbors in descending order
            neighbors.sort((a, b) -> b - a);
            
            int sum = vals[i]; // center node value
            for (int j = 0; j < Math.min(k, neighbors.size()); j++) {
                if (neighbors.get(j) > 0) {
                    sum += neighbors.get(j);
                } else break;
            }
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum;
    }
}
