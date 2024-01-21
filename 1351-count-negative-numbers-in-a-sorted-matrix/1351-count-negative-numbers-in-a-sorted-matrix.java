class Solution {
     public static  int countNegatives(int[][] grid) {
        int neg = 0;
        for (int m = 0; m < grid.length ; m++) {
            for (int n = 0; n < grid[m].length; n++) {
                if (grid[m][n] < 0){
                    neg++;
                }
            }
        }
        return neg;
    }
}