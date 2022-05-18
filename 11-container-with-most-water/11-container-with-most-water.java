class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
	    int maxArea = 0;

	    while (left < right) {
	    	maxArea = Math.max(maxArea, Math.min(height[left], height[right])* (right - left));
		if (height[left] < height[right])
			left++;
		else
			right--;
	    }
	    return maxArea;
    }
}
        /*int result = Integer.MIN_VALUE, min = Integer.MAX_VALUE;       
        for(int i = 0; i < height.length - 1; i++){
            int start_height = height[i];
            for(int j = height.length-1; j > i; j--){
                min = Math.min(start_height, height[j]);
                result = Math.max(result, min * (j-i));
                if(height[j] > start_height)
                    break;
            }
        }
        
        return result;
    }
}*/