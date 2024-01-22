import java.util.Arrays;

public class Solution {
    public int[] solution(int []arr) {
        int[] temp2 = new int[arr.length];
        int temp=10, j=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] != temp)
            {
                temp2[j++] = arr[i];
                temp = arr[i];
            }
        }
        
        int[] answer = Arrays.copyOf(temp2, j);

        return answer;
    }
}