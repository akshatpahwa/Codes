class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right])
                left = mid + 1;
            else
                right = mid;
        }
        int start = left;
        left = 0;
        right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int mid_point = (mid + start) % nums.length;
            if(nums[mid_point] == target)
                return mid_point;
            else if(nums[mid_point] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }
}
        /*int left = 0, right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] >= nums[left]){
                if(target >= nums[left] && target < nums[mid])
                    right = mid-1;
                else
                    left = mid + 1;
            }
            else{
                if(target <= nums[right] && target > nums[mid])
                    left = mid + 1;
                else
                    right = mid - 1;
            } 
        }
        return -1;
    }
}*/