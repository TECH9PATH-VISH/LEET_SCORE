class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int sec=requests[0];
        
        for(int i=0;i<requests.length-1;i++){
            int sum=(Math.abs(requests[i]-requests[i+1]));
            sec+=sum;
        }
        return sec;
        
    }
}