import java.util.*;


class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int area = brown + yellow;

        for (int h= 3; h <= Math.sqrt(area); h++) {
            if (area % h == 0) {
                int w = area / h;
                if ((w - 2) * (h - 2) == yellow) {
                    return new int[]{w, h};
                }
            }
        }
        return answer;
    }
}