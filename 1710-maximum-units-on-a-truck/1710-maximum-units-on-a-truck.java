class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> Integer.compare(b[1],a[1]));
        for(int i = 0; i < boxTypes.length; i++){
            System.out.println(boxTypes[i][0]);
            System.out.println(boxTypes[i][1]);
            System.out.println("-----");
        }
        int result = 0;
        for(int i = 0; i < boxTypes.length; i++){
            int[] temp = boxTypes[i];
            if(temp[0] < truckSize){
                truckSize -= temp[0];
                int val = temp[0] * temp[1];
                result += val;
            }
            else{
                int val = truckSize * temp[1];
                truckSize = 0;
                result += val;
            }
            System.out.println(result);
        }
        return result;
    }
}