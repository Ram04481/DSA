class Solution {
    public int totalFruit(int[] f) {
        Map<Integer, Integer> fc = new HashMap<>();
        int l = 0, max = 0;

        for(int r = 0; r < f.length; r++){
            fc.put(f[r], fc.getOrDefault(f[r], 0) + 1);

            while(fc.size() > 2){
                fc.put(f[l], fc.get(f[l]) - 1);
                if(fc.get(f[l]) == 0) fc.remove(f[l]);
                l++;
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
