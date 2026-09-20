class Solution {
    public int reverseDegree(String s) {
        int totalReverseDegree = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int revAlphabetIndex = 26 - (c - 'a');
  
            int stringIndex = i + 1; 
            
            totalReverseDegree += revAlphabetIndex * stringIndex;
        }
        
        return totalReverseDegree;
    }
}