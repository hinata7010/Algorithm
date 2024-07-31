import java.util.LinkedList;
import java.util.Queue;

class Solution {
    boolean solution(String s) {
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0 ; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                queue.add(s.charAt(i));
            }
            else if( (s.charAt(i) == ')') && queue.isEmpty()){
                  return false;
            }
            else{
                queue.poll();
            }
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.


        return queue.isEmpty();
    }
}