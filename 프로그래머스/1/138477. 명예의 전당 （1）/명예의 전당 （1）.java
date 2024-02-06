import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> honerPlace = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < score.length; i++) {
            if(i < k)
            {
                min = Math.min(score[i], min);
                answer[i] = min;
                honerPlace.add(score[i]);
            }
            else {
                honerPlace.add(score[i]);
                honerPlace.sort(Comparator.naturalOrder());
                honerPlace.remove(0);
                answer[i] = honerPlace.get(0);
            }
        }
        return answer;
    }
}