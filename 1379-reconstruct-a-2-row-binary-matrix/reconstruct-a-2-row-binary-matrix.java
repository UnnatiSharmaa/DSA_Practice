import java.util.*;

class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int n = colsum.length;
        int[] upperRow = new int[n];
        int[] lowerRow = new int[n];

        for (int i = 0; i < n; i++) {
            if (colsum[i] == 2) {
                upperRow[i] = 1;
                lowerRow[i] = 1;
                upper--;
                lower--;
            } else if (colsum[i] == 1) {
                if (upper > lower) {
                    upperRow[i] = 1;
                    upper--;
                } else {
                    lowerRow[i] = 1;
                    lower--;
                }
            }
        }

        // If quotas not satisfied, return empty
        if (upper != 0 || lower != 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> res = new ArrayList<>();
        res.add(toList(upperRow));
        res.add(toList(lowerRow));
        return res;
    }

    private List<Integer> toList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) list.add(num);
        return list;
    }
}
