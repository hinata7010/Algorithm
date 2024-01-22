class Solution {
    public String solution(int n) {
        String[] num = {"4","1","2"};
        String answer = "";

        while(n > 0){
            answer = num[n % 3] + answer;
            n = (n - 1) / 3;
        }
        return answer;
    }
}

// 4으로 나눈다. -> 3진수로 변환한다음 모든자리의 3을 4로 교체한다. for문 2번