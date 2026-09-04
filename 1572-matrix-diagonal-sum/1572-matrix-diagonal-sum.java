class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j){
                    sum+=mat[i][j];
                }

            }
        }
        int i=0;
        int j=mat[i].length-1;
        while(i<mat.length){
            if(i==j){
                i++;
                j--;
                continue;
            }
            sum+=mat[i][j];
            j--;
            i++;
        }
        return sum;
        
    }
}