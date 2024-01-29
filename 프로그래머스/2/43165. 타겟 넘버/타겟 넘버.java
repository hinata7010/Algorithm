import java.util.Arrays;

class Solution {

    static int count = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0,0);
        return count;
    }

    static void dfs(int[] numbers,int target, int depth, int sum)
    {
        if(depth == numbers.length && target == sum)
        {
            count++;
        } else if (depth == numbers.length) {

        }
        else
        {
            dfs(numbers, target, depth+1, sum - numbers[depth]);
            dfs(numbers, target, depth+1, sum + numbers[depth]);
        }
    }
}