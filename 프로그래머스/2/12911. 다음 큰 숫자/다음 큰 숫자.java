class Solution {
    public int solution(int n) {
    String binaryString = Integer.toBinaryString(n);
    int countOnes = Integer.bitCount(n);
    int nextNumber = n + 1;
    
    while (Integer.bitCount(nextNumber) != countOnes) {
        nextNumber++;
    }
    
    return nextNumber;
}

}