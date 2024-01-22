import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int count=0, i=0;
        Queue<Integer> queue = new LinkedList<>();
        
        for(int pt : priorities)
        {
            queue.offer(pt);
        }
        int[] temp = Arrays.copyOf(priorities, priorities.length);
        Arrays.sort(priorities);
        int size = priorities.length-1;
        
        while(!queue.isEmpty())
        {
            if(temp[count++] == priorities[size])
            {
                queue.poll();
                size--;
                if(count-1 == location)
                {
                    answer = temp.length - queue.size();
                    break;
                }
            }
            else
            {
                queue.offer(queue.poll());
            }
            
            if(count == temp.length)
            {
                count = 0;
            }
        }
        return answer;
    }
}