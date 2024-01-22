import java.util.ArrayList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int[] truck_stack = new int[bridge_length];
		ArrayList<Integer> wait_truck = new ArrayList<Integer>();
		
		for(int i=0; i<truck_stack.length; i++)
		{
			truck_stack[i] = 0;
		}
		
		for(int i=0; i<truck_weights.length; i++)
		{
			wait_truck.add(truck_weights[i]);
		}
		
		while(wait_truck.isEmpty() == false || sum(truck_stack) != 0)
		{
			if(wait_truck.isEmpty() == true)
			{
				
			}
			else if(wait_truck.get(0) + sum(truck_stack) > weight)
			{

			}
			else
			{
				truck_stack[0] = wait_truck.get(0);
				wait_truck.remove(0);
			}
			
			for(int i=truck_stack.length-1; i>=1; i--)
			{
				truck_stack[i] = truck_stack[i-1];
			}
			truck_stack[0] = 0;
			answer++;
		}
        answer++;
        return answer;
    }
    public static int sum(int[] a)
	{
		int b = 0;
		for(int i=0; i < a.length; i++)
		{
			b += a[i];
		}
		
		return b;
	}
}