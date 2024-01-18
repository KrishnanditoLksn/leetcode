class Solution {
    public static int maximumWealth(int[][] accounts) {
       int wealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int total = 0;
            for (int j = 0; j < accounts[i].length ; j++) {
                total+=accounts[i][j];
            }
            wealth = Math.max(total , wealth);
        }
        return wealth;
    }
}