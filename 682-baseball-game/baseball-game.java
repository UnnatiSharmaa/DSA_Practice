import java.util.*;

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        
        for (String op : ops) {
            if (op.equals("C")) {
                stack.pop(); // remove last score
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2); // double last score
            } else if (op.equals("+")) {
                int last = stack.pop();
                int secondLast = stack.peek();
                stack.push(last); // push back last
                stack.push(last + secondLast); // sum of last two
            } else {
                stack.push(Integer.parseInt(op)); // integer score
            }
        }
        
        int sum = 0;
        for (int score : stack) {
            sum += score;
        }
        return sum;
    }
}
