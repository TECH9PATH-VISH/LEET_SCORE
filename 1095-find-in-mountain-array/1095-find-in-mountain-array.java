/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int mid=0;
        int n= mountainArr.length();
        int i=0,j=n-1;
        while(i<j){
            mid =(i +((j-i)/2));
            if (mountainArr.get(mid)<mountainArr.get(mid+1)){
                i=mid+1;
            }
            else{
                j=mid;
            }

        }
        int peak = i;
        i=0;
        j=peak;
        while(i<=j){
            mid = (i+((j-i)/2)); 
            if((mountainArr.get(mid)==target)){
                return mid;
            }
            else if((mountainArr.get(mid)<target)){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        i=peak+1;
        j=n-1;
        while(i<=j){
            mid = (i+((j-i)/2)); 
            if((mountainArr.get(mid)==target)){
                return mid;
            }
            else if((mountainArr.get(mid)<target)){
                j = mid - 1;
            }
            else{
                i = mid + 1;
            }
        }
        return -1;
        
    }
}