class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        int [][]merged=new int[intervals.length][2];
        int i=0;

        merged[i]=intervals[0];

        for(int j=1;j<intervals.length;j++){
            if(merged[i][1]>=intervals[j][0]){
                merged[i][1]=Math.max(merged[i][1],intervals[j][1]);
            }
            else{
                i++;
                merged[i]=intervals[j];
            }
        }
        return Arrays.copyOf(merged,i+1);
    }
}