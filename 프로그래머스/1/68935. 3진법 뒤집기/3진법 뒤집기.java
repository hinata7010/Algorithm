class Solution {
    public int solution(int n) {
        int answer = 0;
        String strings = "";

        while (n > 0) {
            strings += n % 3;
            n = n / 3;
        }


        int count = 1;
        for (int i = strings.length() - 1; i >= 0; i--) {
            char currentChar = strings.charAt(i);
            int numericValue = currentChar - '0';
            answer += numericValue * count;
            count = count * 3;
        }

        return answer;
    }
}
