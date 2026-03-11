class Solution {
    public int bitwiseComplement(int n) {
        String str = Integer.toBinaryString(n);
        StringBuilder str2 = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(ch == '1'){
                str2.append('0');
            }else{
                str2.append('1');
            }
        }

        return Integer.parseInt(str2.toString(), 2);
    }
}