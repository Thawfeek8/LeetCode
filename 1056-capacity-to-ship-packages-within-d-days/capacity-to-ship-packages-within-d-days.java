class Solution {
    public int shipWithinDays(int[] weights, int days) {
      int h = 0;
      for(int a:weights){
        h += a;
      }  
      int l = Integer.MIN_VALUE;
      for(int a:weights){
        l = Math.max(l, a);
      }
      while(l <= h){
        int mid = (l+h)/2;
        int reqdays = helper(weights, mid);
        if(reqdays <= days) h = mid-1;
        else l = mid+1;
      }
      return l;
    }
    static int helper(int[] wt, int cap){
        int day = 1;
        int load = 0;
        for(int a:wt){
            if(a + load > cap){
                day += 1;
                load = a;
            }
            else load += a;
        }
        return day;
    }
}