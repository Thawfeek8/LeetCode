class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] raw = new int[26];
        for(int i=0;i<s.length();i++){
            raw[s.charAt(i)-'a']--;
            raw[t.charAt(i)-'a']++;
        }
        for(int i=0;i<raw.length;i++){
            if(raw[i]>0) return false;
        } 
        return true;

    }
}
