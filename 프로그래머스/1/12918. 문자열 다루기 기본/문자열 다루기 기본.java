class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int test;
        try
        {
            test = Integer.parseInt(s);
        }
        catch(Exception e)
        {
            answer = false;
            return answer;
        }
        if(s.length() != 4 && s.length() != 6)
        {
            answer = false;
            return answer;
        }
        answer = true;
        return answer;
    }
}