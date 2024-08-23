class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(x+"");
        return (x+"" ).equals(sb.reverse().toString());
    }
}