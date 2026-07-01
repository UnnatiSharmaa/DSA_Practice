class Solution {
    public int largestInteger(int num) {
        String s = String.valueOf(num);
        int n = s.length();

        // Collect odd and even digits separately
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = s.charAt(i) - '0';
            if (d % 2 == 0) {
                even.add(d);
            } else {
                odd.add(d);
            }
        }

        // Sort descending
        Collections.sort(odd, Collections.reverseOrder());
        Collections.sort(even, Collections.reverseOrder());

        // Reconstruct number
        StringBuilder sb = new StringBuilder();
        int oi = 0, ei = 0;
        for (int i = 0; i < n; i++) {
            int d = s.charAt(i) - '0';
            if (d % 2 == 0) {
                sb.append(even.get(ei++));
            } else {
                sb.append(odd.get(oi++));
            }
        }

        return Integer.parseInt(sb.toString());
    }
}
