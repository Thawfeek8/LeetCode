class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length+1;
        int[] prem = new int[n];
        int a = 0;
        for(int i=1;i<=n;i++){
            a^=i;
        }
        
        for(int i=1;i<n;i+=2){
            a ^= encoded[i];
            
        }
        prem[0] = a;
        for(int i=1;i<n;i++){
            prem[i] = prem[i-1]^encoded[i-1];
        }
        return prem;
        

        
    }
}