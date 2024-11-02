class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0;
        int h = arr.length-1;
        while(l <= h){
            int mid = (l+h)/2;
            int missingcount = arr[mid] - (mid+1);
            if(missingcount < k) l = mid+1;
            else h = mid-1;
        }
        return l+k;
    }
}

// class Solution {
//     public int findKthPositive(int[] arr, int k) {
//         for(int i=1;i<arr.length;i++){
//             if(arr[i] <= k) k++;
//             else break; 
//         }
//         return k+1;
//     }
// } Brute force