class Solution {
    public boolean checkIfPangram(String sentence) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        for(char ch:str.toCharArray()){
            if(sentence.indexOf(ch+"") == -1) return false;

        } 
        return true;
    }
}