import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String temp = String.valueOf(n);
        char[] A = new char[temp.length()];
        for(int i=0;i<temp.length();i++) {
            A[i] = temp.charAt(i);
        }
        Arrays.sort(A);
        temp = "";
        for(int i=0; i<A.length; i++)
        {
            temp = A[i] + temp;
        }
        answer = Long.parseLong(temp);
        return answer;
    }
}