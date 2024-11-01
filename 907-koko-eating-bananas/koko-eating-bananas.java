class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int a: piles){
            max = Math.max(a, max);
        }
        int l = 1;
        int hi = max;
        int ans = -1;
        while(l<=hi){
            int mid = (l+hi)/2;
            if(hours(piles, mid)<=h){
                ans = mid;
                hi = mid-1;
            }
            else l = mid+1;
        }
        return ans;
    }
    static int hours(int[] arr, int mid){
        int n = arr.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            ans += Math.ceil((double)arr[i]/mid);
        }
        return ans;
    }
}


// Naive approach

// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {
//         int n = piles.length;
//         int max = Arrays.stream(piles).max().getAsInt();
        
//         for (int i = 1; i <= max; i++) {
//             int hoursNeeded = fun(piles, i, n);
//             if (hoursNeeded <= h) return i;
//         }
        
//         return -1;
//     }
    
//     static int fun(int[] piles, int hr, int n) {
//         int totalHours = 0;
//         for (int i = 0; i < n; i++) {
//             totalHours += (int) Math.ceil((double) piles[i] / hr);
//         }
//         return totalHours;
//     }
// }
