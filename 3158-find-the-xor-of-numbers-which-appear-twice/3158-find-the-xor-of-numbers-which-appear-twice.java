class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] sc =new int[nums.length];
        Arrays.sort(nums);
        int a=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                sc[a]=nums[i];
                a++;
            }
        }
        int xor=0;
        for(int i=0;i<sc.length;i++){
            xor^=sc[i];
        }
        return xor;
        
    }
}