import java.util.*;

class Solution {
    public int[] beautifulArray(int n) {
        List<Integer> result = build(n);
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }

    private List<Integer> build(int n) {
        if (n == 1) return Arrays.asList(1);

        List<Integer> odds = build((n + 1) / 2);  // odd part
        List<Integer> evens = build(n / 2);       // even part

        List<Integer> res = new ArrayList<>();
        for (int x : odds) res.add(2 * x - 1);    // map to odd numbers
        for (int x : evens) res.add(2 * x);       // map to even numbers

        return res;
    }
}
