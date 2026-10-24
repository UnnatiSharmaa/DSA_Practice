class Solution {
    public int addDigits(int num) {
        // O(1) formula using digital root
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }
}
