class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> l = new ArrayList<>();
        fun(0, s, s.length(), l, ans);
        return ans;
    }
    static void fun(int idx, String str, int n, List<String> l, List<List<String>> ans){
        if(idx == n){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=idx;i<n;i++){
            if(ispalindrome(str, idx, i)){
                l.add(str.substring(idx, i+1));
                fun(i+1, str, n, l, ans);
                l.remove(l.size()-1);
            }
        }
    }
    static boolean ispalindrome(String s, int st, int en){
        while(st <= en){
            if(s.charAt(st) != s.charAt(en)) return false;
            st++;
            en--;
        }
        return true;
    }
}