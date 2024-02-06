import java.util.Arrays;

class Solution {
    public int solution(int n) {
        int[] isPrime = new int[n+1];
        Arrays.fill(isPrime, 1);
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if(isPrime[i] == 0) continue;

            for (int j=2*i; j<=n; j+=i)
            {
                isPrime[j] = 0;
            }
        }

        for (int i = 2; i <= n; i++) {
            if(isPrime[i] != 0) answer++;
        }
        return answer;
    }
}