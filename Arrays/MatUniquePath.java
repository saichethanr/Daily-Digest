// using combinations--> mxn => c(m+n-2,m-1) or c(m+n-2,n-1)

class Solution {
    public int uniquePaths(int m, int n) {
        long ans = 1;
        for (int i = m + n - 2, j = 1; i >= Math.max(m, n); i--, j++) {
            ans = (ans * i) / j;
        }
        return (int) ans;
    }
}

// or by using dfs=>
class Solution {
    public int uniquePaths(int m, int n) {
        return uniquePaths(m, n, 0, 0);
    }

    private int uniquePaths(int m, int n, int i, int j) {
        if (i >= m || j >= n) return 0;        // reached out of bounds - invalid
        if (i == m - 1 && j == n - 1) return 1; // reached the destination - valid solution
        return uniquePaths(m, n, i + 1, j) + uniquePaths(m, n, i, j + 1); // try both down and right
    }
}
