class Solution {
    public int maximumDifference(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    int dif= nums[j]-nums[i];
                    max=Math.max(max,dif);
                }
            }
        }
        if(max==Integer.MIN_VALUE){
            return -1;
        }
        else{
            return max;
        }
    }
}