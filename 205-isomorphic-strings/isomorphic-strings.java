class Solution {
    public boolean isIsomorphic(String s, String t) {

        char[] ans = new char[256];
        char[] rev = new char[256];

        for (int i = 0; i < s.length(); i++) {

            if (ans[s.charAt(i)] == 0) {
                ans[s.charAt(i)] = t.charAt(i);
            }

            if (rev[t.charAt(i)] == 0) {
                rev[t.charAt(i)] = s.charAt(i);
            }

            if (t.charAt(i) != ans[s.charAt(i)] ||
                s.charAt(i) != rev[t.charAt(i)]) {
                return false;
            }
        }

        return true;
    }
}