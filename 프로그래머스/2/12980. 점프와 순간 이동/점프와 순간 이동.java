import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        String two = Integer.toBinaryString(n);
        for(int i =0; i < two.length(); i++){
            if(two.charAt(i) == '1'){
                ans++;
            }
        }

        return ans;
    }
}