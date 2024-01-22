import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
		int a;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++)
        {
            set.add(nums[i]);
        }
        if((int)(nums.length/2) <= set.size())
        {
            answer = (int)((nums.length)/2);
        }
        else
        {
            answer = set.size();
        }
        return answer;
    }
}