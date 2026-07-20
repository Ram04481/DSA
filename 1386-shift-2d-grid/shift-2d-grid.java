class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        k %= total;

        int newIdx = k;
        int[][] temp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(newIdx==total) newIdx = 0;
                int nx = newIdx/n;
                int ny = newIdx%n;

                temp[nx][ny] = grid[i][j];
                newIdx++;
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i=0; i<m; i++){
            List<Integer> lst = new ArrayList<>();
            for(int j=0; j<n; j++){
                lst.add(temp[i][j]);
            }
            ans.add(lst);
        }

        return ans;
    }
}