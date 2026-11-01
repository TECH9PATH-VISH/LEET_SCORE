class Solution {
    public int minMoves(int[] nums) {
        int x=Integer.MAX_VALUE;
        for(int a:nums){
            if(x>a){
                x=a;
            }
        }
        int sum=0;
        for(int a:nums){
            int b=a-x;
            sum+=b;
        }
        return sum;
    }
}