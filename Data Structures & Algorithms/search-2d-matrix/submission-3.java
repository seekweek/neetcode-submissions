class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;         // number of rows
        int n = matrix[0].length;      // number of columns

        int left = 0;
        int right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Convert 1D index to 2D index
            int row = mid / n;
            int col = mid % n;

            int midValue = matrix[row][col];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}

