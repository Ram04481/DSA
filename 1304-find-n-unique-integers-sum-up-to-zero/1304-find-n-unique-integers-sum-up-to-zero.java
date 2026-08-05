class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int indx = 0;

        for (int i = 1; i <= n / 2; i++) {
            arr[indx++] = i;
            arr[indx++] = -i;
        }

        return arr;
    }
}