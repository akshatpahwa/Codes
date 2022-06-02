class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int[] temp = intervals[0];
        list.add(temp);
        for(int[] interval : intervals){
            if(interval[0] <= temp[1])
                temp[1] = Math.max(interval[1], temp[1]);
            else{
                temp = interval;
                list.add(temp);
            }
        }
        return list.toArray(new int [list.size()][]);
    }
}