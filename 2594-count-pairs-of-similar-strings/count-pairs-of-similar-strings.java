import java.util.*;

class Solution {
    public int similarPairs(String[] words) {
        Map<String, Integer> freq = new HashMap<>();
        int count = 0;

        for (String w : words) {
            // unique characters set
            Set<Character> set = new HashSet<>();
            for (char c : w.toCharArray()) {
                set.add(c);
            }

            // canonical representation (sorted string)
            List<Character> list = new ArrayList<>(set);
            Collections.sort(list);
            StringBuilder sb = new StringBuilder();
            for (char c : list) sb.append(c);
            String key = sb.toString();

            // count pairs
            int prev = freq.getOrDefault(key, 0);
            count += prev; // each previous same key forms a new pair
            freq.put(key, prev + 1);
        }

        return count;
    }
}
