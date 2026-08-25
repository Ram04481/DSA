class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % k == 0) {
                set.add(nums[i]);
            }
        }

        for (int j = k; ; j += k) {
            if (!set.contains(j)) {
                return j;
            }
        }
    }
}