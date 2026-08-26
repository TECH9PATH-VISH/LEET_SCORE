class Solution {
    public boolean hasAlternatingBits(int n) {
        String bin = Integer.toBinaryString(n);
        for(int i=0;i<bin.length()-1;i++){
            if(bin.charAt(i)=='1'){
                if (bin.charAt(i+1)!='0'){
                    return false;
                }
            }
            if(bin.charAt(i)=='0'){
                if (bin.charAt(i+1)!='1'){
                    return false;
                }
            }
        }
        return true;
        
    }
}