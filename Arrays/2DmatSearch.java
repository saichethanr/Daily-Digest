class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false; // Return false if the matrix is empty
        }

        int m = matrix.length;        // Number of rows
        int n = matrix[0].length;     // Number of columns

        int low = 0, high = m * n - 1; // Start with the entire range (flattened 1D index range)

        while (low <= high) {
            int mid = low + (high - low) / 2;  // Find the middle index in the 1D representation

            // Convert the 1D index (mid) to 2D matrix coordinates
            int midRow = mid / n;
            int midCol = mid % n;

            int midValue = matrix[midRow][midCol]; // Value at the mid position

            if (midValue == target) {
                return true;  // Found the target
            }
            else if (midValue < target) {
                low = mid + 1;  // Move to the right side (larger values)
            }
            else {
                high = mid - 1; // Move to the left side (smaller values)
            }
        }

        return false;  // Target not found
    }
}