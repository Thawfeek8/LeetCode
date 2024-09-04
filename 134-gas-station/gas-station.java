class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        int totalcost = 0;
        int tank = 0;
        int index = 0;
        for(int i=0;i<gas.length;i++){
            totalcost += cost[i];
            totalgas += gas[i];
            tank += gas[i] - cost[i];

            // if tank goes negative set it as o and move the index
            if(tank<0){
                index = i+1;
                tank = 0;
            } 
        }
        // the other case
        if(totalgas<totalcost) return -1;
        return index;
    }
}