class Solution {
    public int findDuplicate(int[] arr) {
        int index = 0;
        while(index < arr.length){
            int correctIndex = arr[index] - 1;
            if(arr[index] != arr[correctIndex]){
                int temp = arr[index];
                arr[index] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else index++;
        }
        for(int i=0;i<arr.length;i++){
            if(i+1 != arr[i]) return arr[i];
        }
        return -1;
    }
}