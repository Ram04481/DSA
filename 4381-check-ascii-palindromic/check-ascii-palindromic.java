class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String bin = Integer.toBinaryString(s.charAt(i));

            if (bin.length() < 8) {
                bin = "0" + bin;
            }
            sb.append(bin);
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}
