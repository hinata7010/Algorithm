import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
        public String solution(String s) {
            String answer = "";
            String[] leatcode = s.split(" ");
            List<Integer> list = new ArrayList<>();
            for (String s1 : leatcode){
                list.add(Integer.parseInt(s1));
            }
            int max = Collections.max(list);
            int min = Collections.min(list);
            
            answer = min + " " + max;
            return answer;
        }
}