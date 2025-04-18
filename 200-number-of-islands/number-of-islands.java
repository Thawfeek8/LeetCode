class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == '1'){
                    count += 1;
                    dfs(i,j,grid,row,col);
                }
            }
        }
        return count;
    }

        public static void dfs(int i,int j,char[][] grid,int row,int col){
            if(i==-1 || i>=row || j==-1 || j>=col || grid[i][j]=='0'){
                return   ;
            }
            grid[i][j] = '0';

            dfs(i+1,j,grid,row,col);
            dfs(i-1,j,grid,row,col);
            dfs(i,j+1,grid,row,col);
            dfs(i,j-1,grid,row,col);
        }
    }