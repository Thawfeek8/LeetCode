class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int t=0;
        for(int i=0;i<arr1.length;i++){
            t^=arr1[i];
        }
        int c=0;
        for(int i=0;i<arr2.length;i++){
                c^=arr2[i];
        }
        return t&c;
    }
}