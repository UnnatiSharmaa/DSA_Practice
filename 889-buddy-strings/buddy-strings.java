class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        // Case 1: Strings are already equal
        if (s.equals(goal)) {
            int[] freq = new int[26];

            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
                if (freq[ch - 'a'] > 1) {
                    return true; // duplicate character exists
                }
            }
            return false;
        }

        // Case 2: Find mismatched positions
        int first = -1;
        int second = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false; // more than 2 mismatches
                }
            }
        }

        return second != -1 &&
               s.charAt(first) == goal.charAt(second) &&
               s.charAt(second) == goal.charAt(first);
    }
}