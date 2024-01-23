class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strings= s.split("");
        if(strings.length%2 == 1)
        {
            return strings[strings.length/2];
        }
        else
        {
            return strings[strings.length/2-1] + strings[strings.length/2];
        }
    }
}