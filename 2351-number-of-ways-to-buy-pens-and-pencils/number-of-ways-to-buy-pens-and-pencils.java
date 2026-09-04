class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ways = 0;
        // iterate over possible pens
        for (int pens = 0; pens <= total / cost1; pens++) {
            int remaining = total - pens * cost1;
            int maxPencils = remaining / cost2;
            ways += (long) maxPencils + 1;
        }
        return ways;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.waysToBuyPensPencils(20, 10, 5)); // Output: 9
        System.out.println(sol.waysToBuyPensPencils(5, 10, 10)); // Output: 1
    }
}
