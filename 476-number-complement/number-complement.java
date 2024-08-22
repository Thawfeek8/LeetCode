class Solution {
    public int findComplement(int num) {
        String str = Integer.toBinaryString(num);
        String s = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                s+='0';
            }
            else 
            s+='1';
        }
        int p = 1;
        int ans = Integer.parseInt(s,2);
        
        return ans;
        
    }
}