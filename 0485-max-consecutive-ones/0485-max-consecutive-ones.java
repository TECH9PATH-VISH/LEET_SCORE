class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int j=0;
        int mx=0;
        while(j<nums.length){
            if (nums[i]==0){
                i++;
            }
            if (nums[j]==0){
                j++;
                i=j;
                if (j>=nums.length){
                    break;
                }
            }
            while(nums[i]==1 && nums[j]==1 && j<nums.length){
                int len=j-i+1;
                mx= Math.max(len,mx);
                j++;
                if (j>=nums.length){
                    break;
                }
            }
        }
        return mx;

        
    }
}