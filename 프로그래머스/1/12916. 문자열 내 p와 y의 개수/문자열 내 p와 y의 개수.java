class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int p = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'y')
            {
                y++;
            }
            if (s.charAt(i) == 'p')
            {
                p++;
            }
        }
        return p == y;
    }
}