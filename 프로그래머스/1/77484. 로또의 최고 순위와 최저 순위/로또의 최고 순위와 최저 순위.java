class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0, zcnt=0;
        for(int i=0; i<6; i++)
        {
            if(lottos[i] == 0)
            {
                zcnt++;
            }
            for(int j=0; j<6; j++)
            {
                if(lottos[i] == win_nums[j])
                {
                    cnt++;
                }
            }
        }
        System.out.println(zcnt + ", " + cnt);
        if(cnt > 0 || zcnt > 0)
        {
            answer[0] = 7 - (cnt + zcnt);
        }
        else
        {
            answer[0] = 6;
        }
        if(cnt == 0)
        {
            answer[1] = 6;
        }
        else
        {
            answer[1] = 7 - cnt;
        }
        return answer;
    }
}