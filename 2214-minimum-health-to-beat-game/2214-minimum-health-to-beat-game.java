class Solution {
    public long minimumHealth(int[] damage, int armor) {
        long result = 0;
        int max = 0;
        for(int i : damage){
            max = Math.max(max, i);
            result += i;
        }
        if(max > armor)
            result -= armor;
        else
            result -= max;
        return result+1;
    }
}