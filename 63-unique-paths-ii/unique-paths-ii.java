class Solution {
    public int uniquePathsWithObstacles(int[][] arr) 
    {
        int m=arr.length;
        int n=arr[0].length;
        int sr[][]=new  int[m][n];    
        if(arr[0][0]==1)
        {
            sr[0][0]=0;
        }
        else
        {
            sr[0][0]=1;
        }
        for(int i=1;i<m;i++)
        {
                if(arr[i][0]==1)
                {
                    sr[i][0]=0;
                }
                else
                {
                    sr[i][0]=sr[i-1][0];
                }
        }
            for(int i=1;i<n;i++)
            {
               if(arr[0][i]==1)
               {
                  sr[0][i]=0;
               }  
               else
               {
                  sr[0][i]= sr[0][i-1];
               }
            }
            for(int i=1;i<m;i++)
            {
                for(int j=1;j<n;j++)
                {
                    if(arr[i][j]==1)
                    {
                        sr[i][j]=0;
                    }
                    else
                    {
                        sr[i][j]=sr[i-1][j]+sr[i][j-1];
                    }
                }
            }
        
        return sr[m-1][n-1];
    }
}