class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String temp = "";
        for(int i=0; i<n; i++)
        {
            answer[i] = Integer.toString(arr1[i] | arr2[i]);
        }
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(Integer.parseInt(answer[i]) % 2 == 1)
                {
                    temp = temp + "#";
                }
                else
                {
                    temp = temp + " ";
                }
                answer[i] = Integer.toString(Integer.parseInt(answer[i]) / 2);
            }
            StringBuffer sb = new StringBuffer(temp);
            temp = sb.reverse().toString();
            answer[i] = temp;
            temp = "";
        }
        return answer;
    }
}