class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        
        for (int p : piles) {
            high = Math.max(high, p);
        }
        
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canEatAll(piles, h, mid)) { 
                high = mid; 
            } else {
                low = mid + 1; 
            }
        }
        
        return low; 
    }
    
    private boolean canEatAll(int[] piles, int h, int speed) {
        long totalHours = 0; 
        
        for (int pile : piles) {
            totalHours += (pile + speed - 1) / speed; 
            
            if (totalHours > h) {
                return false; 
            }
        }
        
        return totalHours <= h;
    }
}
