class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int[] freq = new int[51]; 

        for (int num : nums) {
            freq[num]++;
        }

        if (k == 1) {
            int maxVal = -1;
            for (int i = 0; i <= 50; i++) {
                if (freq[i] == 1) {
                    maxVal = i; 
                }
            }
            return maxVal;
        }

        if (k == n) {
            int maxVal = -1;
            for (int num : nums) {
                if (num > maxVal) maxVal = num;
            }
            return maxVal;
        }

        int ans = -1;
        if (freq[nums[0]] == 1) {
            ans = Math.max(ans, nums[0]);
        }
        if (freq[nums[n - 1]] == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;
    }
}
