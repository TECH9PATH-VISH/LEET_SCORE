class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> sc = new ArrayList<>();
        if(mountain.length<3){
            return sc;
        }
        for(int i=1;i<mountain.length-1;i++){
            if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1]){
                sc.add(i);
                i++;
            }
        }
        return sc;
        
    }
}