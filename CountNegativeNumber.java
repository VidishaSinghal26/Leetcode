// Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

// Example 1:
// Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
// Output: 8
// Explanation: There are 8 negatives number in the matrix.

// Example 2:
// Input: grid = [[3,2],[1,0]]
// Output: 0

class Solution {
    public int countNegatives(int[][] grid) {
      
  //Brute Force ( TC - O(n^2) )
        int  c =0;
        for(int  i = 0 ; i<grid.length ;i++){
            for(int j = 0 ; j <grid[0].length ; j++){
                if(grid[i][j] <0)
                  c++;
            }
        }
        return c;
      
 //Optimized Approach ( TC - O(n+m) )
        int i = grid.length -1;
        int j = 0;

        int res = 0;
        while(i >= 0 && j<grid[0].length) {
            if(grid[i][j] < 0) {
        i--;
        res += grid[0].length - j;       
            } else {
                j++;                         
            }
        }
        return res;
      
    }
}
