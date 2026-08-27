class Solution {
    public boolean bin(int x){
        if (x == 0) return false;

        StringBuilder bit = new StringBuilder();
        while (x > 0) {
            int res = x % 2;
            if (res == 0) {
                bit.append('0');
            } else {
                bit.append('1');
            }
            x /= 2;
        }
         return prime(bit.reverse().toString());
    }
    public boolean prime(String x){
        int cnt=0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='1'){
                cnt++;
            }
        }
        if (cnt < 2) return false;
        for (int i = 2; i * i <= cnt; i++) {
            if (cnt % i == 0) {
                return false;
            }
        }
        return true;


    }
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            if(bin(i)){
                count++;
            }
        }
        return count;
    }
}