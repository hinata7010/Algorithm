import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
		int[] copy_array = {};
		int[] answer = new int[commands.length];
		int i, j, k, count=0;
		for(int a=0; a<commands.length; a++)
		{
			i = commands[a][0];
			j = commands[a][1];
			k = commands[a][2];
			
			copy_array = Arrays.copyOfRange(array, i-1, j);
			Arrays.sort(copy_array);
			
			answer[count++] = copy_array[k-1];
		}
        
        return answer;
    }
}