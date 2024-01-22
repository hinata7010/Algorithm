import java.util.ArrayList;

class Solution {
    public int solution(int[][] board, int[] moves) 
    {
        ArrayList basket = new ArrayList();
		int answer = 0;
		for(int i=0; i<moves.length; i++)
		{
			if(moves[i] == 0)
			{
				continue;
			}
			for(int j=0; j<board[moves[i]-1].length; j++)
			{
				if(board[j][moves[i]-1] != 0)
				{
					basket.add(board[j][moves[i]-1]);
					board[j][moves[i]-1] = 0;
					if(basket.size() >= 2 && (basket.get(basket.size()-1) == basket.get(basket.size()-2)))
					{
						basket.remove(basket.size()-1);
						basket.remove(basket.size()-1);
						answer++;
						answer++;
					}
					break;
					
				}
			}
		}
       return answer;
    }
}