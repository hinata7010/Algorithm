class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int xmax = Integer.MIN_VALUE;
        int ymax = Integer.MIN_VALUE;
        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1])
            {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        for (int[] four : sizes)
        {
            xmax = Math.max(xmax, four[0]);
            ymax = Math.max(ymax, four[1]);
        }
        
        return xmax*ymax;
    }
}