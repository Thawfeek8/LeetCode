
// Why Not Typecasting?
// If you directly typecast the character to an integer, you'll get its ASCII value, not the digit it represents. For instance:

// java
// Copy code
// char ch = '5';
// int digit = (int) ch; // digit will be 53, not 5
// '0' is 48 when you subtract '5' i.e 53 - 48 you will eventually get 5

class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        List<int[]> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String s = Integer.toString(nums[i]);
            StringBuilder sb = new StringBuilder();
            for(char ch:s.toCharArray()){
                sb.append(mapping[ch - '0']);
            }
            li.add(new int[]{nums[i],Integer.parseInt(sb.toString()),i});
        }

        li.sort((a,b) -> {
            if(a[1] != b[1]){
                return Integer.compare(a[1],b[1]);
            }
            else{
                return Integer.compare(a[2],b[2]);
            }
        });

        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i] = li.get(i)[0];
        }

        return res;
    }
}
    