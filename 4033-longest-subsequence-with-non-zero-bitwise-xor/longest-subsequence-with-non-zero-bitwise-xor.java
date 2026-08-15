class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int totalXor = 0;
        boolean allzero = true;

        for (int x : nums) {
            totalXor ^= x;
            if (x > 0) allzero  = false;
        }

        if (totalXor > 0) {
            return n;
        }

        return allzero ? 0 : n - 1;
    }
}