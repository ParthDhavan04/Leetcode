class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        queens(board, 0, solutions);
        return solutions;
    }

    public int queens(boolean[][] board, int row, List<List<String>> solutions) {
        if (row == board.length) {
            solutions.add(display(board)); // Add current board configuration to solutions
            return 1;
        }

        int count = 0;

        // Placing the queen and checking for each column
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;    // Place the queen
                count += queens(board, row + 1, solutions); // Recursively place for next row
                board[row][col] = false;   // Backtrack
            }
        }
        return count;
    }

    public boolean isSafe(boolean[][] board, int row, int col) {
        // Check vertical column
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }

        // Check upper left diagonal
        for (int i = 1; i <= Math.min(row, col); i++) {
            if (board[row - i][col - i]) return false;
        }

        // Check upper right diagonal
        for (int i = 1; i <= Math.min(row, board.length - col - 1); i++) {
            if (board[row - i][col + i]) return false;
        }

        return true;
    }

    public List<String> display(boolean[][] board) {
        List<String> currentSolution = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder rowString = new StringBuilder();
            for (boolean cell : row) {
                rowString.append(cell ? "Q" : ".");
            }
            currentSolution.add(rowString.toString()); // Each row as a single string
        }
        return currentSolution;
    }
}
