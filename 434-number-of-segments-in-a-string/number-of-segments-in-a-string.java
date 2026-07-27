class Solution {
    public int countSegments(String s) {
        String[] ans = s.trim().split("\s+");

        if (s == null || s.trim().isEmpty()) {
            return 0;
        }
        return ans.length;
    }
}