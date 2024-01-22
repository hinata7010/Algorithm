class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int temp;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                for(int k=j+1; k<nums.length; k++)
                {
                    temp = nums[i] + nums[j] + nums[k];
                    if(isPrime(temp))
                    {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
    
    boolean isPrime(int num)
    {
        for (int i = 2; i < num; i++) 
        {
                // 1과 num 자신 외에 나누어지는 수가 있는지 검사할 조건문
            if (num % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}