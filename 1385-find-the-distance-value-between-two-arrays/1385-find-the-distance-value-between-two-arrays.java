class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=arr1.length;
       for(int i=0;i<arr1.length;i++){
        int cnt=0;

        for(int j=0;j<arr2.length;j++){
            if(Math.abs(arr1[i]-arr2[j])<=d){
                cnt++;
            }
        }
        if(cnt>0){
            c--;
        }
       } 
       return c;
    }
}