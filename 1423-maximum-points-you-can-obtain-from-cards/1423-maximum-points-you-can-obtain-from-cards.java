class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int length = cardPoints.length-1, lSum = 0, rSum = 0;
        for(int i = 0; i < k; i++){
            lSum += cardPoints[i];
        }
        int max = lSum;
        for(int i = k - 1; i >= 0; i--){
            rSum += cardPoints[length--];
            lSum -= cardPoints[i];
            max = Math.max(lSum + rSum, max);
        }
        return max;
    }
}