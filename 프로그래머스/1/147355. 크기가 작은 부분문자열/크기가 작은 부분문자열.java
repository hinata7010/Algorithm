import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < t.length() - length+1; i++) {
            StringBuilder string = new StringBuilder();
            for (int j = 0; j < length; j++) {
                if(i + j >= t.length())
                {
                    break;
                }
                string.append(t.charAt(i + j));
            }
            list.add(Long.parseLong(string.toString()));
        }

        for (int i = 0; i < list.size(); i++) {
            if(Long.parseLong(p) >= list.get(i))
            {
                answer++;
            }
        }
        return answer;
    }
}