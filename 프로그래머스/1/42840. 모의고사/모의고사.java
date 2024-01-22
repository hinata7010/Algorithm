import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer  = {};
		int[] answer3 = new int[3];
		ArrayList<Integer> answer2 = new ArrayList<Integer>();
		int number2 = number2(answers);
		int number3 = number3(answers);
		
		int max = number1(answers);
		answer2.add(1);
		if(max < number2)
		{
			max = number2;
			answer2.remove(0);
			answer2.add(2);
		}
		else if(max == number2)
		{
			answer2.add(2);
		}
		if(max < number3)
		{
			max = number3;
			answer2.remove(0);
			if(answer2.isEmpty() == false)
			{
				answer2.remove(0);
			}
			
			answer2.add(3);
		}
		else if(max == number3)
		{
			answer2.add(3);
		}
		for(int i=0; i<answer2.size(); i++)
		{
			answer3[i]= answer2.get(i); 
		}
		
		answer = Arrays.copyOf(answer3, answer2.size());
        Arrays.sort(answer);
        return answer;
    }
    public static int number1(int[] a) 
	{
		int[] number1 = {1,2,3,4,5};
		int count=0, sanda=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(number1[sanda++] == a[i])
			{
				count++;
			}
			if(sanda == 5)
			{
				sanda = 0;
			}
		}
		
		return count;
	}
	
	public static int number2(int[] a)
	{
		int[] number2 = {1,3,4,5};
		int count=0, sanda=0;
		boolean flag = true;
		
		for(int i=0; i<a.length; i++)
		{
			if(flag == true)
			{
				flag = false;
				if(a[i] == 2)
				{
					count++;
				}
			}
			else
			{
				flag = true;
				if(number2[sanda++] == a[i])
				{
					count++;
				}
				if(sanda == 4)
				{
					sanda = 0;
				}
			}
		}
		
		return count;
	}
	
	public static int number3(int[] a)
	{
		int[] number3 = {3,1,2,4,5};
		boolean flag = true;
		int count=0, sanda=0;
		
		for(int i=0; i< a.length; i++)
		{
			if(flag == true)
			{
				flag = false;
				if(a[i] == number3[sanda])
				{
					count++;
				}
			}
			else
			{
				flag = true;
				if(a[i] == number3[sanda])
				{
					count++;
				}
				sanda++;
				if(sanda == 5)
				{
					sanda = 0;
				}
			}
		}
		
		return count;
	}
}