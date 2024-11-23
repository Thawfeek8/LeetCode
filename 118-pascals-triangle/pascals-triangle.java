class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(generaterow(i));
        }
        return ans;
        
    }
    static List<Integer> generaterow(int n){
        int ans = 1;
        List<Integer> l = new ArrayList<>();
        l.add(ans);
        for(int i=1;i<n;i++){
            ans = ans*(n-i);
            ans /= i;
            l.add(ans);
        }
        return l;
    }
}