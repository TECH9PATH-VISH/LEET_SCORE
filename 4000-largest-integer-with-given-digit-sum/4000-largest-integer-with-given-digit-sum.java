class Solution {
    public int largestInteger(int n, int s) {
        if(s==0){
            return 0;
        }
        int a=1;
        for(int i=0;i<n;i++){
            a*=10;
        }
        a-=1;
        while(a>0){
            if(s!=sum(a)){
                a--;
                continue;
            }
            // else if(a%s!=0){
            //     a--;
            // }
            else{
                return a;
            }
        }
        return -1;
        
    }
    public int sum(int x){
        int sum=0;
        while(x>0){
            int y=x%10;
            sum+=y;
            x/=10;
        }
        return sum;
    }
}