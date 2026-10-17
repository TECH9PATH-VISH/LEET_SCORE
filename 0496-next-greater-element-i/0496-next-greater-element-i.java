class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] ans =new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
        boolean found=false;
        boolean swap=false;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    found=true;
                }
                else if(!found){
                    continue;
                }
                if(nums1[i]<nums2[j]){
                    ans[i]=nums2[j];
                    swap=true;
                    break;
                }
            }
            if(found && !swap){
            ans[i]=-1;
            }
            
        }
        return ans;
    }
}