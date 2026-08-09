class Solution {
    public int countEven(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            int sum = 0;
            int n = i;

            while (n != 0) {
                int d = n % 10;
                sum += d;
                n /= 10;
            }
            if (sum % 2 == 0) count++;
        }
        return count;
    }
}