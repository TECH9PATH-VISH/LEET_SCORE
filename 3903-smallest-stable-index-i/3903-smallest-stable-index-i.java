class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if(nums.length==1){
            return 0;
        }
        int[] max = new int[nums.length];
        int[] min = new int[nums.length];
        int i=0;
        int j=1;
        int a=1;
        max[0] = nums[0];
        while(j<nums.length){
            if(nums[i]>nums[j]){
                max[a]=nums[i];
                a++;
                j++;
            }else{
                max[a]=nums[j];
                a++;
                i=j;
                j++;
            }
        }
        i=nums.length-1;
        j=nums.length-2;
        int b=nums.length-2;
        min[nums.length-1]=nums[nums.length-1];
        while(j>=0){
            if(nums[i]<nums[j]){
                min[b]=nums[i];
                b--;
                j--;
            }else{
                min[b]=nums[j];
                b--;
                i=j;
                j--;
            }
        }
        i=0;
        for(i=0;i<nums.length;i++){
            int diff=max[i]-min[i];
            if(diff<=k){
                return i;
            }
        }
        return -1;
    }
}