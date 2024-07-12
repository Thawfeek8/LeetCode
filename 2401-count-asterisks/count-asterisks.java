class Solution {
    public int countAsterisks(String s) {
        Boolean flag = false;
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '|'){
                if(flag == true){
                    flag = false;
                }
                else{
                flag = true;

                }
            }

            if(c== '*' && flag == false){
                count++;
            }
        }
        return count;
    }
}