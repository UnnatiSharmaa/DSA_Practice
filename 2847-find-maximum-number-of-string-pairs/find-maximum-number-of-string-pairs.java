class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
          Set<String> set = new HashSet<>();
        int count = 0;
        for (String w : words) {
            String rev = new StringBuilder(w).reverse().toString();
            if (set.contains(rev)) {
                count++;
                set.remove(rev); // ensure ek word ek hi pair mein aaye
            } else {
                set.add(w);
            }
        }
        return count;
    }
    
}