class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int max=Integer.MIN_VALUE;
        int a=0;
        int b=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                a=i;
            }
            if(nums[i]<min){
                min=nums[i];
                b=i;
            }
        }
        int left = Math.min(a, b);
        int right = Math.max(a, b);
        int n = nums.length;
        int front=right+1;
        int back=n-left;
        int each=(left + 1) + (n - right);
        return Math.min(front, Math.min(back, each));

        
    }
}