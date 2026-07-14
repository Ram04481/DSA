class Solution {
    public int minimumCost(int[] nums, int k) {
        long MOD = 1_000_000_007L;
        long a = k;
        long count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (a < nums[i]) {
                long n = (nums[i] - a + k - 1L) / k;

                count += n;
                a += n * k;
            }
            a -= nums[i];
        }
        long ans = count + 1;
        if (count % 2 == 0) count /= 2;
        else ans /= 2;
        return (int) (((count % MOD) * (ans % MOD)) % MOD);
    }
}