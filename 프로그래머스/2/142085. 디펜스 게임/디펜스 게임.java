import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        for (int i = 0; i < enemy.length; i++) {
            n -= enemy[i];
            queue.offer(enemy[i]);
            if(n < 0) {
                if(k > 0) {
                    n += queue.poll();
                    k--;
                } else {
                    break;
                }
            }
            answer = i + 1;
        }
        return answer;
    }
}