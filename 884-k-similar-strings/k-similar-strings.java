import java.util.*;

class Solution {
    public int kSimilarity(String s1, String s2) {
        if (s1.equals(s2)) return 0;

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(s1);
        visited.add(s1);

        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                String curr = queue.poll();
                if (curr.equals(s2)) return steps;

                // Find first mismatch index
                int i = 0;
                while (curr.charAt(i) == s2.charAt(i)) i++;

                // Try swapping with later chars that match s2[i]
                for (int j = i + 1; j < curr.length(); j++) {
                    if (curr.charAt(j) == s2.charAt(i) && curr.charAt(j) != s2.charAt(j)) {
                        String next = swap(curr, i, j);
                        if (!visited.contains(next)) {
                            visited.add(next);
                            queue.offer(next);
                        }
                    }
                }
            }
            steps++;
        }
        return -1; // should never happen for anagrams
    }

    private String swap(String s, int i, int j) {
        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }
}
