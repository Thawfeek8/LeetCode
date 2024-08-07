class Solution {
    public int strStr(String haystack, String needle) {
        int a = -1;
        if(haystack.indexOf(needle) != -1){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}