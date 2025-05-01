class Solution {
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else i++;
        }

        for(int ii=0;ii<arr.length;ii++){
            if(ii+1 != arr[ii]) {
                return new int[]{arr[ii], ii+1};
            }
        }
        return new int[] {-1, -1};
    }
}