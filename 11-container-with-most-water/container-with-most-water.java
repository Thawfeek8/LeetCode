class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int area = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            int width = right-left;
            area = Math.min(height[left],height[right])*width;
            max = Math.max(area,max);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return max;
    }
}