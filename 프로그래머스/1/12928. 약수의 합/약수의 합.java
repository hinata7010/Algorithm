class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n == 0)
        {
            return 0;
        }
        else if(n == 1)
        {
            return 1;
        }
        for(int i=2; i<=n/2; i++)
        {
            if(n % i == 0)
            {
                answer = answer + i;
            }
        }
        
        return answer+1+n;
    }
}