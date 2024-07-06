class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] res = new int[Math.min(nums1.length,nums2.length)];
        
        for(int i=0;i<nums1.length;i++){
            
            int equal = 0;
            boolean flag = false;
            int temp = -1;
            int count = 0;

            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                   equal = nums2[j];
                   break;
                }
                count++;
            }
            for(int k = count;k<nums2.length;k++){
                if(nums2[k]>equal){
                    temp = nums2[k];
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                res[i] = -1;
            }
            else{
            res[i] = temp;
            }
        }
        return res;
    }
}