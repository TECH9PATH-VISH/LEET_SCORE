class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int a=0;
        int n1,n2;
        for(int i=0;i<len;i++){
            if(i==0){
                ans[i]=nums[i];
                a++;
            }
            else{
                n1=nums[i-1];
                n2=nums[i];
                if(n1!=n2){
                    ans[a]=n2;
                    a++;
                }
            }

        }
        for(int i =0;i<len;i++){
            nums[i]=ans[i];
        }
        return a;

    }
}