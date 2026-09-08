class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0){
            return true;
        }
        int n=num;
        int temp=0;
        while(num>0){
            int rem=num%10;
            temp=temp*10+rem;
            num/=10;
        }
        int temp2=0;
        num=temp;
        while(num>0){
            int rem=num%10;
            temp2=temp2*10+rem;
            num/=10;
        }
        if(temp2==n){
            return true;
        }
        else{
            return false;
        }

        
    }
}