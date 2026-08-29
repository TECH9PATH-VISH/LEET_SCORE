class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int ans=-1;
        int min = Integer.MAX_VALUE;
        int[] arr =new int[drones.length];
        for(int i=0;i<drones.length;i++){
            int a=Math.abs(drones[i][0] - target[0]) + Math.abs(drones[i][1] - target[1]);
            arr[i]=a;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=drones[i][2]){
                if(arr[i]<min){
                    min=arr[i];
                    ans=i;
                }
                
            }
        }
        return ans;
    }
}