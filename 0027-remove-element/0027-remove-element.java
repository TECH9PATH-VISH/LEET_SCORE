class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int[] re = new int[len];
        int a=0,b=0;
        for(int i=0;i<len;i++){
            if(nums[i]!=val){
                re[a]=nums[i];
                a++;
            }
            
        }
        for(int i=0;i<len;i++){
            nums[i]=re[i];
        }
        return a;

    }
}