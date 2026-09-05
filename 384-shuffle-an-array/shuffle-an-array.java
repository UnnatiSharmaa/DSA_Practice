import java.util.*;

class Solution {
    private int[] original;
    private Random rand;

    // Constructor: store original array and initialize Random
    public Solution(int[] nums) {
        original = nums.clone();
        rand = new Random();
    }

    // Reset: return the original configuration
    public int[] reset() {
        return original.clone();
    }

    // Shuffle: Fisher–Yates algorithm
    public int[] shuffle() {
        int[] shuffled = original.clone();
        for (int i = shuffled.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); // random index [0..i]
            // swap shuffled[i] and shuffled[j]
            int temp = shuffled[i];
            shuffled[i] = shuffled[j];
            shuffled[j] = temp;
        }
        return shuffled;
    }
}
