/**
It can be proved that if n is not a happy number,
It will finally goto a
4→16→37→58→89→145→42→20→4 loop.
so just consider if go to one of these number, it will be not happy number, otherwise, it will finally stop at 1
The Hint is that for n > 100, the next number will less than n
 */
class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = square(slow);
            fast = square(square(fast));
        }while(slow != fast);

        if(slow == 1){
            return true;
        }
        return false;
    }
    public static int square(int number){
        int sum = 0;
        while(number > 0){
            int rem = number % 10;
            sum += rem*rem;
            number = number / 10;
        }
        return sum;
    }
}