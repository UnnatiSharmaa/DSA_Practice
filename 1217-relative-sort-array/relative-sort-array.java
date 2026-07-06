import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        // Step 1: arr2 ke order ke hisaab se
        for (int num : arr2) {
            int count = freq.getOrDefault(num, 0);
            for (int i = 0; i < count; i++) {
                result.add(num);
            }
            freq.remove(num);
        }

        // Step 2: remaining elements sort karke add karo
        List<Integer> remaining = new ArrayList<>();
        for (int num : freq.keySet()) {
            int count = freq.get(num);
            for (int i = 0; i < count; i++) {
                remaining.add(num);
            }
        }

        Collections.sort(remaining);
        result.addAll(remaining);

        // Convert list to array
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}
