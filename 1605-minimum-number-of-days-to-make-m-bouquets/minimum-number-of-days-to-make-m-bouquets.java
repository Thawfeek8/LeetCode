class Solution {
    public int minDays(int[] bloomDay, int bouquet, int adjacentflowers) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int a:bloomDay){
            max = Math.max(a, max);
            min = Math.min(a, min);
        }
        // if(bouquet*adjacentflowers > max) return -1
        int l = min;
        int h = max;
        int ans = -1;
        while(l <= h){
            int mid = (l+h)/2;
            if(possible(bloomDay, mid, bouquet, adjacentflowers)){
                ans = mid;
                h = mid-1;
            }
            else l = mid+1;
        }
        return ans;
    }
    static boolean possible(int[] arr, int mid, int bouquet, int adjacentflowers){
        int cnt = 0;
        int neighbour = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] <= mid){
                cnt++;
                if(cnt == adjacentflowers){
                    neighbour++;
                    cnt = 0;
                }
            }
            else cnt = 0;
        }
        return neighbour >= bouquet;
    }
}