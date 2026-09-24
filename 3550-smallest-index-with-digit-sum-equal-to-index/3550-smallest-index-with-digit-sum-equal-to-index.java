class Solution {
    int dig(int x, int i){
        int sum=0;
        while(x>0){
            sum+=(x%10);
            x/=10;
        }
        if( sum==i){
            return i;
        }
        return -1;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int temp=dig(nums[i],i);
            if(temp!=-1){
                return i;
            }
        }
        return -1;
    }
}