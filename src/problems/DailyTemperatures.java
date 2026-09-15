package problems;

import java.util.Map;
import java.util.Stack;

public class DailyTemperatures {
    public int[] bruteForce(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int j = i+1;
            boolean found = false;
            for (;j < temperatures.length; j++) {
                if (temperatures[j] > temperatures[i]){
                    found = true;
                    break;
                }
            }
            answer[i] = found ? j-i : 0;
        }
        return answer;
    }
    public int[] withStack(int[] temperatures){
        Stack<Integer> st = new Stack<>();
        int[] answers = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!st.empty() && temperatures[st.peek()] < temperatures[i]){
                int j = st.pop();
                answers[j] = i - j;
            }
            st.push(i);
        }
        return answers;
    }
}
