class Solution {
    public int maximumCount(int[] nums) {
        if(nums[0]>0){
            return nums.length;
        }
        if(nums[nums.length-1]<0){
            return nums.length;
        }
        int pos=0;
        int neg=0;
        for(int k: nums){
            if(k>0){
                pos++;
            }
            else if(k<0){
                neg++;
            }
        }
        return Math.max(pos,neg);

        
    }
}