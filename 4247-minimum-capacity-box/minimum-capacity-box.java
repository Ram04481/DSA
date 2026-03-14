class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int idx = -1;
        int min = Integer.MAX_VALUE;
 
        for (int i = 0; i < capacity.length; i++){
            if (capacity[i] >= itemSize){
                if (min > capacity[i]){
                    min = capacity[i];
                    idx = i;
                }
            }
        }
        return idx;
    }
}