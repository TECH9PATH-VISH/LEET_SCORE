class Solution {
    public static int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>max){
                max=x;
            }
        }
        return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> bb=new ArrayList<>();
        int mx=max(candies);
        for(int x:candies){
            if((x+extraCandies)>=mx){
                bb.add(true);
            }else{
                bb.add(false);
            }
        }
        return bb;
        


    }
}