class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public boolean solve(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;

        // Find an empty cell represented by '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if (!emptyLeft)
                break;
        }

        if (emptyLeft)
            return true;  // Sudoku is solved

        // Backtracking
        for (char number = '1'; number <= '9'; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board))
                    return true;
                else
                    board[row][col] = '.';  // Backtrack
            }
        }
        return false;
    }

    public boolean isSafe(char[][] board, int row, int col, char num) {
        // Check the row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num)
                return false;
        }

        // Check the column
        for (char[] chars : board) {
            if (chars[col] == num)
                return false;
        }

        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num)
                    return false;
            }
        }
        return true;
    }
}
