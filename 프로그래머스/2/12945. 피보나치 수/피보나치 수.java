class Solution {
    public long solution(long n) 
    {
        long answer = 0, a=1, b=0;
        
        for(int i=2; i<=n; i++)
        {
            answer = (a+b)%1234567;
            b = a;
            a = answer;
        }
        
        return answer;
    }
    
}