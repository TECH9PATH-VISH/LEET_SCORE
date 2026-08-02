class Solution {
    public boolean stoneGame(int[] piles) {
    int i=0;
    int j=piles.length-1;
    int k=0;
    int alice=0;
    int bob=0;
    while(i<j){
        if( k%2==0){
            if(piles[i]>=piles[j]){
                alice+=piles[i];
                i++;
            }
            else{
                alice+=piles[j];
                j--;
            }
        }
        else{
            if(piles[i]>=piles[j]){
                bob+=piles[i];
                i++;
            }
            else{
                bob+=piles[j];
                j--;
            }
        }
        
    }
    if(alice>bob){
        return true;
    }
    else{
        return false;
    }
        
    }
}