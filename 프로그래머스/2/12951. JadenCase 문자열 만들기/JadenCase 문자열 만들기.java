import java.util.*;

class Solution {
    public String solution(String s) {
        String[] list = s.split(" ", -1); // -1 옵션을 사용해 연속된 공백을 포함한 모든 부분을 포함
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < list.length; i++) {
            if (list[i].length() > 0) {
                String first = list[i].substring(0, 1).toUpperCase();
                String rest = list[i].substring(1).toLowerCase();
                answer.append(first).append(rest);
            }
            if (i != list.length - 1) {
                answer.append(" ");
            }
        }
        return answer.toString();
    }
}
