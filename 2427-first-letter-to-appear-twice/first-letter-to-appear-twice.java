class Solution {
    public char repeatedCharacter(String s) {
        ArrayList<Character> l = new ArrayList<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(l.contains(s.charAt(i))){
                return s.charAt(i);
            }
            else{
                l.add(s.charAt(i));
            }
        }
        return 'a';
    }
}