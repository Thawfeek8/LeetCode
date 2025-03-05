class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int n = image.length;
        int m = image[0].length;
        int iniColor = image[sr][sc];
        int[][] copy = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                copy[i][j] = image[i][j];
            }
        }
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};
        //if(newColor != iniColor)
        bfs(sr, sc, image, copy, delRow, delCol, iniColor, newColor, n, m);
        return copy;
    }
    // static void dfs(int row, int col, int[][] image, int[][] copy, int[]delRow,
    //                 int[] delCol, int iniColor, int newColor, int n, int m){
            
    //         copy[row][col] = newColor;
    //         for(int i=0;i<4;i++){
    //             int nr = row+delRow[i];
    //             int nc = col+delCol[i];
    //             if(nr>=0 && nr<n && nc>=0 && nc<m && image[nr][nc] == iniColor && 
    //                     copy[nr][nc] != newColor)
    //                     dfs(nr, nc, image, copy, delRow, delCol, iniColor, newColor, n, m);
    //         }

    // }

    static void bfs(int row, int col, int[][] image, int[][] copy, int[]delRow,
                     int[] delCol, int iniColor, int newColor, int n, int m){
        
            Queue<Pair> q = new LinkedList<>();
            q.offer(new Pair(row, col));
            while(!q.isEmpty()){
                int a = q.peek().first;
                int b = q.peek().second;
                q.poll();
                copy[a][b] = newColor;
                for(int i=0;i<4;i++){
                    int nr = a+delRow[i];
                    int nc = b+delCol[i];
                    if(nr>=0 && nr<n && nc>=0 && nc<m && image[nr][nc] == iniColor && 
                        copy[nr][nc] != newColor){
                            
                            q.offer(new Pair(nr, nc));
                    }
            }
            }
                     }        


}
class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}