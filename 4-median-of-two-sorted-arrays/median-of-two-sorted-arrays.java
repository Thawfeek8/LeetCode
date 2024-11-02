class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n= nums2.length;
        int a[] =new int[m+n];
        int c= a.length;
        double sum=0;
        int k=0;
        for(int i=0;i<m;i++){
            a[k++]=nums1[i];
        }
        for(int j=0;j<n;j++){
             a[k++]=nums2[j];
        }
        Arrays.sort(a);
        if(c%2!=0){
            sum=a[(c/2)];
            return sum;
        }
        else{
            int o=(c/2)-1; 
            sum +=a[o];
            sum += a[c/2];
            sum /=2;
            return sum;

            
        }

        
    }
}