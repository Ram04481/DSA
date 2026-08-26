class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();

        for (int i : nums1) {
            set.add(i);
        }

        HashSet<Integer> set1 = new HashSet<>();

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                set1.add(nums2[i]);
            }
        }
        int[] array = new int[set1.size()];

        int i = 0;
        for (int j : set1) {
            array[i] = j;
            i++;
        }

        return array;

    }
}