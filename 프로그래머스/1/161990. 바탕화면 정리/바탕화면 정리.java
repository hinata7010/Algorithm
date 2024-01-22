class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int xMax = Integer.MIN_VALUE;
        int xMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if(wallpaper[i].charAt(j) == '#')
                {
                    if(j > xMax)
                    {
                        xMax = j;
                    }
                    if(j < xMin)
                    {
                        xMin = j;
                    }
                    if(i > yMax)
                    {
                        yMax = i;
                    }
                    if(i < yMin)
                    {
                        yMin = i;
                    }
                }
            }
        }
        answer[1] = xMin;
        answer[0] = yMin;
        answer[3] = xMax+1;
        answer[2] = yMax+1;
        return answer;
    }
}