class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        int a=0;
        int j=n;
        int b=1;

        for(int i=0;i<2*n;i+=2){
            ans[i]=nums[a];
            a++;
            ans[b]=nums[j];
            j++;
            b+=2;
        }
        return ans;

    }
}