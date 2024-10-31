class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a = first(nums, target);
        if(a == -1) return new int[]{-1, -1};
        int b = last(nums, target);
        return new int[]{a, b};
    }
    static int first(int[] arr, int x){
        int l = 0;
        int h = arr.length-1;
        int fi = -1;
        while(l <= h){
            int mid = (l+h)/2;
            if(arr[mid] == x){
                fi = mid;
                h = mid-1;
            }
            else if(arr[mid]<x) l = mid+1;
            else h = mid-1;
        }
        return fi;
    }
    static int last(int[] arr, int x){
        int la = -1;
        int l = 0;
        int h = arr.length-1;
        while(l <= h){
            int mid = (l+h)/2;
            if(arr[mid] == x){
                la = mid;
                l = mid+1;
            }
            else if(arr[mid]<x) l = mid+1;
            else h = mid-1;
        }
        return la;
    }
}