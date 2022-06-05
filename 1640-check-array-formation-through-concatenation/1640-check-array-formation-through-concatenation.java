class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int i = 0;
        int size = arr.length;
        while(i < size){
            int found = -1;
            for(int j = 0; j < pieces.length; j++){
                if(pieces[j][0] == arr[i]){
                    found = j;
                    break;
                }
            }
            if(found == -1)
                return false;
            int[] target = pieces[found];
            for(int x : target){
                if(x != arr[i]){
                    return false;
                }
                i++;
            }
        }
        return true;
    }
}