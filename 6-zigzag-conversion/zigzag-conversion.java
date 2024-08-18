class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            sb[i] = new StringBuilder();
        }
        int a = 0;
        boolean flag = false;
        for(char ch:s.toCharArray()){
            sb[a].append(ch);
            if(a==0||a==numRows-1){
                flag = !flag;
            }
            if(flag) a+=1;
            else a-=1;
        }
        StringBuilder str = new StringBuilder();
        for(StringBuilder sd:sb){
            str.append(sd);
        }
        return str.toString();
    }
}