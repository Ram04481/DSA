class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;

        for (int p : piles) {
            r = Math.max(p, r);
        }

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (canEatAll(piles, mid, h)) {
                r = mid;
            }
            else {
                l = mid + 1;
            }
        }
        return l;
    }
    public boolean canEatAll (int[] piles, int mid, int h) {
        int totalHours = 0;

        for (int pile : piles) {
            totalHours += (pile + mid - 1) / mid;

            if (totalHours > h) {
                return false; 
            }
        }

        return totalHours <= h;
    }
}