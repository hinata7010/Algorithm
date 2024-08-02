import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int eliZero = 0;
        String copyS = s;
        
        while (!copyS.equals("1")) {
            int zeroCount = 0;
            for (int i = 0; i < copyS.length(); i++) {
                if (copyS.charAt(i) == '0') {
                    zeroCount++;
                }
            }
            eliZero += zeroCount;
            
            copyS = copyS.replaceAll("0", "");
            int length = copyS.length();
            copyS = Integer.toBinaryString(length);
            
            count++;
        }
        
        answer[0] = count;
        answer[1] = eliZero;
        return answer;
    }
}
