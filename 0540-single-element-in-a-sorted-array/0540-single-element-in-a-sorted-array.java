class Solution {
    public int singleNonDuplicate(int[] nums) {
        // 1hr 28m 57s
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int mid=(i+((j-i)/2));
            if(mid%2==1){
                mid-=1;
            }
            if(nums[mid]==nums[mid+1]){
                i=mid+2;
            }
            else{
                j=mid;
            }
        }
        return nums[j];
        
    }
}