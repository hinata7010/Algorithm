class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] checknumber = new boolean[10];
        for (int number : numbers) {
            checknumber[number] = true;
        }
        for (int i = 0; i < checknumber.length; i++) {
            if(!checknumber[i])
            {
                answer += i;
            }
        }
            
        return answer;
    }
}