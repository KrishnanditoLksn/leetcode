class Solution {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        var total = 0;

        for (int hour : hours) {
            if (hour >= target) {
                total++;
            }
        }
        return total;
    }
}