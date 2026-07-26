class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] arr = score.clone();
        Arrays.sort(arr);
        int l = 0; int r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        String[] str = new String[score.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0;  j < score.length; j++) {
                if (arr[i] == score[j] && i == 0) {
                    str[j] = "Gold Medal";
                }
                else if (arr[i] == score[j] && i == 1) {
                    str[j] = "Silver Medal";
                }
                else if (arr[i] == score[j] && i == 2) {
                    str[j] = "Bronze Medal";
                }
                else if (arr[i] == score[j] && i > 2) {
                    str[j] = String.valueOf(i + 1);
                }
            }
        }
        return str;
    }
}