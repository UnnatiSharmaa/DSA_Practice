class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;

        // Merge characters alternately
        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }

        // Append remaining characters if any
        if (i < word1.length()) {
            sb.append(word1.substring(i));
        }
        if (j < word2.length()) {
            sb.append(word2.substring(j));
        }

        return sb.toString();
    }
}
