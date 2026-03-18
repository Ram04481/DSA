class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n1 = nums[0];
        int n2 = nums[nums.length - 1];

        int div = 0;
        for (int i = 1; i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                div = Math.max (div, i);
            }
        }

        return div;
    }
}