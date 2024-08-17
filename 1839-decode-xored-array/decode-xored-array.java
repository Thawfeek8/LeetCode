class Solution {
    public int[] decode(int[] encoded, int first) {
        int orglen = encoded.length+1;
        int org[] = new int[orglen];
        org[0] = first;
        for(int i=0;i<orglen-1;i++){
            org[i+1] = encoded[i]^org[i] ;    
        }
        return org;
    }
}