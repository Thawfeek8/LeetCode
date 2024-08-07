class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findcombination(0,candidates,ds,target,res);

        return res;
    }

    public static void findcombination(int i,int[] arr,List<Integer> ds
    ,int sum,List<List<Integer>> res){
        if(i == arr.length){ return;
                    }

            if(sum == 0){ 
                res.add(new ArrayList<>(ds));
            
            return;
        }
            //pick
            if(arr[i] <= sum){
                ds.add(arr[i]);
                findcombination(i,arr,ds,sum-arr[i],res);
                ds.remove(ds.size()-1);
            }
            //not pick
            findcombination(i+1,arr,ds,sum,res);
    } 
}