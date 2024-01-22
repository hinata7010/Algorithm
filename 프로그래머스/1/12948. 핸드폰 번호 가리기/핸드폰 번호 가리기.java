class Solution {
    public String solution(String phone_number) {
        String temp = phone_number.substring(0, phone_number.length()-4);
        String temp2 = "";
        for(int i=0; i<phone_number.length()-4; i++)
        {
            temp2 += "*";
        }
        phone_number = phone_number.replace(temp, temp2);	
        
        return phone_number;
    }
}