import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        List<Integer> basket = new ArrayList<>();

        for(int i=1; i < food.length; i++)
        {
            for(int j=0; j< food[i]/2; j++)
            {
                basket.add(i);
            }
        }

        basket.add(0);

        for(int i=food.length-1; i > 0; i--)
        {
            for(int j=0; j< food[i]/2; j++)
            {
                basket.add(i);
            }
        }

        for (int i = 0; i < basket.size(); i++) {
            answer += basket.get(i);
        }
        return answer;
    }
}