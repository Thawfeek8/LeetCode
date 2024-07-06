class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int ans=0;
        int g[]=new int[garbage.length];
        int p[]=new int[garbage.length];
        int m[]=new int[garbage.length];
        for(int i=0;i<garbage.length;i++){
            for(int j=0;j<garbage[i].length();j++){
                if(garbage[i].charAt(j)=='G'){
                    g[i]=g[i]+1;
                }
                if(garbage[i].charAt(j)=='P'){
                    p[i]=p[i]+1;
                }
                if(garbage[i].charAt(j)=='M'){
                    m[i]=m[i]+1;
                }
            }
        }
            int gval=0;
            int pval=0;
            int mval=0;
            int gpoint=0;
            int ppoint=0;
            int mpoint=0;
            for(int i=g.length-1;i>=0;i--){
                if(g[i]>0){
                 gpoint=i; 
                 break;  
                }

            }
            for(int i=p.length-1;i>=0;i--){
                if(p[i]>0){
                 ppoint=i;  
                 break; 
                }

            }
            for(int i=m.length-1;i>=0;i--){
                if(m[i]>0){
                 mpoint=i;
                 break;   
                }

            }
            for(int i=0;i<garbage.length;i++){
                if(i==0){
                gval=gval+g[i];
                pval=pval+p[i];
                mval=mval+m[i];
                
            }
            else{
                if(i<=gpoint){
                gval=gval+(g[i]+travel[i-1]);
                }
                if(i<=ppoint){
                pval=pval+(p[i]+travel[i-1]);
                }
                if(i<=mpoint){
                mval=mval+(m[i]+travel[i-1]);
                }
                
            }

        }
        return gval+mval+pval;
    }
}