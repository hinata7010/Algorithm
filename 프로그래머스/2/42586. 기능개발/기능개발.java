import java.util.Arrays;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] now_progress = Arrays.copyOf(progresses, progresses.length);
		int[] answer2 = new int[100];
		int[] answer = {};
		int count =0, complete=0, count2=0, accumlate_complete=0;
		
		while(accumlate_complete != progresses.length)
		{
			for(int j=0; j<progresses.length; j++)
			{
				now_progress[j] = now_progress[j] + speeds[j];
			}
			
			while(count < now_progress.length)
			{
				if((now_progress[count++] >= 100))
				{
					complete++;
				}
				else
				{
					count--;
					break;
				}
			}
			
			if(complete != 0)
			{
				answer2[count2++] = complete;
			}
			accumlate_complete += complete;
			complete=0;
		}
		
		answer = Arrays.copyOf(answer2, count2);
        
        return answer;
    }
}