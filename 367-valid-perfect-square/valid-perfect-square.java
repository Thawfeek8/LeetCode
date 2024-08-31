class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;  
        long left = 2;
        long right = num / 2;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long ans = mid * mid;
            if (ans == num) {
                return true;
            } else if (ans > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
