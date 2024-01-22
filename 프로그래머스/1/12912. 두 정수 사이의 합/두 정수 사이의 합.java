class Solution {
    public long solution(long a, long b) {
        long answer = 0;
        if(a == b)
        {
            answer = a;
        }
        else
        {
            if(a>b)
            {
                answer = ((a+b)*(a-b+1))/2;
            } 
            
            else
            {
                 answer = ((a+b)*(b-a+1))/2;
            }
        }
        
        return answer;
    }
}