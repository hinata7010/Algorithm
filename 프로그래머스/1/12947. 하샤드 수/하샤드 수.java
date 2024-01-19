class Solution {
    public static boolean solution(int x) {
        boolean answer = true;
        int temp = x;
        int sum = 0;
        while(x > 0)
        {
            sum += x%10;
            x = x/10;
        }
        return temp % sum == 0;
    }
}