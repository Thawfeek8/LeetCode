class Solution {
    public int minimumPushes(String word) {
        int count=0;
        if(word.length()/8==0){
            count=word.length()%8;
        }else if(word.length()/8==1){
            count=8+(word.length()%8)*2;
        }
        else if(word.length()/8==2){
            count=24+(word.length()%8)*3;
        }else {
            count=48+(word.length()%8)*4;
        }
        return count;
    }
}