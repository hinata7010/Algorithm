class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0, summoney=0;
        for(int i=1; i<=count; i++)
        {
            sum += price;
            summoney += sum;
        }
        if(money-summoney < 0)
        {
            return Math.abs(money-summoney);
        }
        else
        {
            return 0;
        }
    }
}