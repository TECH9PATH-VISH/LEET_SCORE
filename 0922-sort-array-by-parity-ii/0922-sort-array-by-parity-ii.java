class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] odd = new int[(nums.length/2)];
        int[] even = new int[(nums.length/2)];
        int a=0;
        int b=0;
        for(int x:nums){
            if(x%2==0){
                even[a]=x;
                a++;
            }
            else{
                odd[b]=x;
                b++;
            }
        }
        a=0;
        b=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=even[a];
                a++;
            }
            else{
                nums[i]=odd[b];
                b++;
            }
        }
        return nums;
    }
}