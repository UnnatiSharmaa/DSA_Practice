class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;  // Base cases

        int left = 1, right = x, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // avoid overflow

            if ((long) mid * mid == x) {
                return mid;   // perfect square
            } else if ((long) mid * mid < x) {
                ans = mid;    // store candidate
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;  // floor value
    }
}
