class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int i=0;
        while(i < nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else i++;
        }

        for(int j=0;j<nums.length;j++){
            if(j+1 != nums[j]) l.add(j+1);
        }
        return l;
    }
}