class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();

        for (int index = 0; index < nums.length - 1; index++) {
            if (nums[index] == nums[index + 1]) {
                list.add(nums[index]);
            }
        }
        return list;
    }
}