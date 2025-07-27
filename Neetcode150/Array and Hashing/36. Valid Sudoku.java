class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = 9; // Standard Sudoku board size is 9x9

        // Arrays of HashSets to track seen numbers in:
        // - each row (rows[i])
        // - each column (cols[i])
        // - each 3x3 sub-box (boxes[i])
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        // Initialize all HashSets for rows, columns, and boxes
        for (int i = 0; i < N; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Traverse every cell in the Sudoku board
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                char val = board[r][c]; // Current cell value

                // Skip if the cell is empty (denoted by '.')
                if (val == '.') continue;

                // Check for duplicates in the current row
                if (rows[r].contains(val)) return false; // Duplicate found
                rows[r].add(val); // Mark the number as seen in the row

                // Check for duplicates in the current column
                if (cols[c].contains(val)) return false; // Duplicate found
                cols[c].add(val); // Mark the number as seen in the column

                // Compute 3x3 box index:
                // Each 3x3 box has a unique index from 0 to 8.
                // Formula: (row / 3) * 3 + (col / 3)
                int idx = (r / 3) * 3 + (c / 3);

                // Check for duplicates in the 3x3 box
                if (boxes[idx].contains(val)) return false; // Duplicate found
                boxes[idx].add(val); // Mark the number as seen in the box
            }
        }

        // If all checks pass, the board is valid
        return true;
    }
}
