/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int begin = 1, end = n, mid = 0;
        while(begin < end){
            mid = begin + (end - begin)/2;
            if(isBadVersion(mid) == false)
                begin = mid+1;
            else
                end = mid;
        }
        return begin;
    }
}