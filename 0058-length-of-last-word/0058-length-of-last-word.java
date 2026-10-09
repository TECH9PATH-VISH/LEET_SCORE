class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int count =0;
        for(int i =len-1;i>=1;i--){
            if(s.charAt(i)!=' '){
                if(s.charAt(i-1)==' '){
                    break;
                }
                count++;
            }
        }
        return count+1;
        
    }
}