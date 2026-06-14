class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closeSum = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length - 2; i++){
            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int currSum = nums[i] + nums[l] + nums[r];

                if (Math.abs(currSum - target) < Math.abs(closeSum - target)) {
                    closeSum = currSum;
                }
                if (currSum < target) {
                    l++;
                } else if (currSum > target) {
                    r--;
                } else {
                    return currSum; 
                }
            }
        }
        return closeSum;
    }
}