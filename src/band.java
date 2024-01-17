class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int currentHealth = health;
        int bandageTime = bandage[0];
        int bandageRecover = bandage[1];
        int bandageFinallyRecover = bandage[2];
        int fightTime = Integer.MIN_VALUE;
        int success = 0;

        for (int i = 0; i < attacks.length; i++) {

            if(attacks[i][0] > fightTime)
            {
                fightTime = attacks[i][0];
            }
        }

        int count=0;

        for (int i = 0; i <= fightTime; i++) {
            if(attacks[count][0] == i)
            {
                currentHealth -= attacks[count][1];
                if(currentHealth <= 0)
                {
                    return -1;
                }
                success = 0;
                count++;
            }
            else
            {
                success++;
                currentHealth += bandageRecover;
                if(success == bandageTime)
                {
                    currentHealth += bandageFinallyRecover;
                    success = 0;
                }

                if(currentHealth > health)
                {
                    currentHealth = health;
                }
            }
        }

        return currentHealth;
    }
}
