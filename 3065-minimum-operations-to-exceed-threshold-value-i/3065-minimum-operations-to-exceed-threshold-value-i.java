class Solution {
    public int minOperations(int[] nums, int k) {
        int cnt =0;
        for(int i=0;i<nums.length;i++){
            if(k>nums[i]){
                cnt++;
            }
        }
        return cnt;
        
    }
}