class Solution {
    public String bin(int x){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            if (x % 2 == 0) {
                s.append("0");
            } else {
                s.append("1");
            }
            x /= 2;
        }
        return s.reverse().toString();
    }
    public boolean isPalindromic(String s) {
        String sh="";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = (int) ch;
            sh+=bin(ascii);
        }
        int left = 0;
        int right = sh.length() - 1;

        while (left < right) {
            if (sh.charAt(left) != sh.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    
        
    }
}