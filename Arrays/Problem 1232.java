class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        int diffX = coordinates[1][0] - coordinates[0][0];
        int diffY = coordinates[1][1] - coordinates[0][1];

        for (int i = 1; i < n - 1; i++) {
            int currentDiffX = coordinates[i + 1][0] - coordinates[i][0];
            int currentDiffY = coordinates[i + 1][1] - coordinates[i][1];

            // Cross-multiply to compare slopes: diffX/diffY == currentDiffX/currentDiffY
            if (diffX * currentDiffY != diffY * currentDiffX) {
                return false;
            }
        }
        return true;
    }
}
