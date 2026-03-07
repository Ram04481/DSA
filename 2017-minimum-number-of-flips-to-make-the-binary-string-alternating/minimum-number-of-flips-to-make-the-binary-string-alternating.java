class Solution {
    public int minFlips(String s) {
        int n = s.length();
        s = s + s;

        int ans = Integer.MAX_VALUE;
        int dif1 = 0, dif2 = 0;

        for(int i = 0; i < s.length(); i++){
            char exp1 = (i % 2 == 0) ? '0' : '1';
            char exp2 = (i % 2 == 0) ? '1' : '0';

            if(s.charAt(i) != exp1) dif1++;
            if(s.charAt(i) != exp2) dif2++;

            if(i >= n){
                char p1 =((i - n) % 2 == 0) ? '0' : '1';
                char p2 =((i - n) % 2 == 0) ? '1' : '0';

                if(s.charAt(i - n) != p1) dif1--;
                if(s.charAt(i - n) != p2) dif2--; 

            }

            if(i >= n - 1){
                ans = Math.min(ans, Math.min(dif1, dif2));
            }
        }
        return ans;
    }
}