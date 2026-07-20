class Solution {
    public String toHex(int num) {
         if (num == 0) {
            return "0";
        }

        String ans = "";
        char[] hex = {
            '0', '1', '2', '3',
            '4', '5', '6', '7',
            '8', '9', 'a', 'b',
            'c', 'd', 'e', 'f'
        };

        while (num != 0) {
            int last = num & 15;      
            ans = hex[last] + ans;    
            num = num >>> 4;          
        }

        return ans;
    }
}