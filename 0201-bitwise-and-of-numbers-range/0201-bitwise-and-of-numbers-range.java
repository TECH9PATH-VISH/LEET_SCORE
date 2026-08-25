class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int bit=1;
        while (right > left) {
            right &= (right - 1);
        }
        return right;
        
        
    }
}