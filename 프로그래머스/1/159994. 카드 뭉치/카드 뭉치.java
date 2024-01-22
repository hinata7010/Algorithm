class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        boolean flag = true;
        int c1 = 0, c2 = 0, g = 0;
        while (flag && g < goal.length) {
            if (c1 < cards1.length && goal[g].equals(cards1[c1])) {
                g++;
                c1++;
            } else if (c2 < cards2.length && goal[g].equals(cards2[c2])) {
                g++;
                c2++;
            } else {
                flag = false;
            }
        }

        if (flag) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
