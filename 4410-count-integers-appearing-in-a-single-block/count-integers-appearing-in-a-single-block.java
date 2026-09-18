class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 1);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        int cnt = 0;
        for(int val : map.values()){
            if(val == 1) cnt++;
        }
        return cnt;
    }
}