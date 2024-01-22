import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
		int answer[] = {};
		int answer2[] = new int[9999];
		ArrayList<Integer> temp2 = new ArrayList<Integer>();
		int count = 0;
		int sum=0;
		TreeSet<Integer> temp = new TreeSet<Integer>();
		
		for(int i=0; i<numbers.length; i++)
		{
			for(int j=i; j<numbers.length; j++)
			{
				if(i == j)
				{
					continue;
				}
				sum = numbers[i] + numbers[j];
				if(temp.add(sum))
				{
					temp2.add(sum);
				}
			}
		}
		
		for(int i=0; i<temp2.size(); i++)
		{
			answer2[i] = temp2.get(i);
			count++;
		}
		answer = Arrays.copyOf(answer2, count);
	
		Arrays.sort(answer);
        
        return answer;
        
    }
}