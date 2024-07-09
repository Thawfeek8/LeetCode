/**
1.Firstly sum the arrival + time then update ans = sum - arr[1]
2. Then compare the sum with next arrival if it is greater then sum = sum + arr[1]
3. If it is smaller then sum will be calculated same as we calculated in the first step.
 */
class Solution {
    public double averageWaitingTime(int[][] customers) {
        long ans = 0;
        long sum = 0;
        for(int[] arr:customers){
            if(sum>arr[0]){
             sum = sum + arr[1];
             ans += sum - arr[0];
            }
            else{
                sum = arr[0] + arr[1];
                ans += sum - arr[0];
            }
        }
        double res = (double) ans / customers.length;
        return res;
    }
}