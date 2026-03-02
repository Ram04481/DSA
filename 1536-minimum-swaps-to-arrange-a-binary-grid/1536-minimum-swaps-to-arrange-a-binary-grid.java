class Solution {
    public int minSwaps(int[][] grid) {
        int[] zeros = new int[grid.length];

        for(int i = 0; i < grid.length; i++){
            int count = 0;

            for(int j = grid.length - 1; j >= 0 && grid[i][j] == 0; j--){
                count++;
            }

            zeros[i] = count;
        }

        int swap = 0;

        for(int i = 0; i < grid.length; i++){

            int req = grid.length - 1 - i;
            int j = i;

            while(j < grid.length && zeros[j] < req){
                j++;
            }
            if(j == grid.length){
                return -1;
            }

            while(j > i){

                int temp = zeros[j];
                zeros[j] = zeros[j - 1];
                zeros[j - 1] = temp;

                swap++;
                j--;
            }
        }

        return swap;
    }
}