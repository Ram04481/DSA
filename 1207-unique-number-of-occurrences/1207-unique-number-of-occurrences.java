class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Step 1: Count frequencies
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Check uniqueness of frequencies
        HashSet<Integer> set = new HashSet<>();
        
        for(int freq : map.values()){
            if(set.contains(freq)) return false;
            set.add(freq);
        }
        
        return true;
    }
}