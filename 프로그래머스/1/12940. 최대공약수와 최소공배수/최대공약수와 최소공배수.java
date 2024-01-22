class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int temp, a=n, b=m;
        if(m > n)
        {
            temp = m;
            m = n;
            n = temp;
        }
        while(m != 0) 
        {
		    int r = n % m;
		    n = m;
		    m = r;
	    }
        answer[0] = n;
        answer[1] = a*b / n;
        return answer;
    }
}