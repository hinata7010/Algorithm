import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(long n) {
        int[] answer1 = {};
        int[] answer = {};
        
        String strings = String.valueOf(n);
        answer1 = Arrays.stream(strings.split("")).mapToInt(Integer::parseInt).toArray();
        answer = new int[answer1.length];
        for(int i = 0; i < answer1.length; i++)
        {
            answer[i] = answer1[answer.length-i-1];
        }
        return answer;
    }
}