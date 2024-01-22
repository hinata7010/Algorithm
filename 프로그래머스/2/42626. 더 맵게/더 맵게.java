import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0, first, second, result;
        PriorityQueue<Integer> quene = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++)
        {
            quene.add(scoville[i]);
        }
        while(quene.peek() < K && quene.size() > 1)
        {
            first = quene.poll();
            second = quene.poll();
            result = combine(first, second);
            quene.add(result);
            answer++;
        }
        if(quene.size() == 1 && quene.peek() < K)
        {
            return -1;
        }
        else
        {
            return answer;
        }
    }
    
    int combine(int a, int b)
    {
        int result;
        
        result = a + (b*2);
        
        return result;
    }
    
}