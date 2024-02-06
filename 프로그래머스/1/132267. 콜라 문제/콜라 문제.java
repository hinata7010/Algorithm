class Solution {
    //마트에 주어야 하는 병 수 a
    //마트가 주는 콜라병 수 b
    //상빈이가 가지고 있는 빈병의 수 n
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a)
        {
            int extraBottle = n % a;
            int callback = n/a*b;
            answer += callback;
            n = 0;
            n += callback + extraBottle;
        }
        return answer;
    }
}