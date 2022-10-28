class Solution {
    public int maxProfit(int[] prices) {
        int maxsofar  = prices[0];
        int minsofar = prices[0];
        int result = 0;
        for(int price : prices){
            minsofar = Math.min(minsofar, price);
            if(price > minsofar)
                result = Math.max(result, price-minsofar);
        }
        return result;
    }
}