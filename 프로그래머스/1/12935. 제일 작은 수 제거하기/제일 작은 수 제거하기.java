class Solution {
    public int[] solution(int[] arr) {
       if(arr.length == 1 || arr.length == 0)
        {
            return new int[] {-1};
        }
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            min = Math.min(j,min);
        }
        System.out.println(min);
        int[] answer = new int[arr.length-1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(min == arr[i])
            {
                continue;
            }
            else {
                answer[count] = arr[i];
                count++;
            }
        }


        return answer;
    }
}