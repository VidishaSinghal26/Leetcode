// Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
// An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

// Example 1:
// Input: grid = [
//   ["1","1","1","1","0"],
//   ["1","1","0","1","0"],
//   ["1","1","0","0","0"],
//   ["0","0","0","0","0"]
// ]
// Output: 1

// Example 2:
// Input: grid = [
//   ["1","1","0","0","0"],
//   ["1","1","0","0","0"],
//   ["0","0","1","0","0"],
//   ["0","0","0","1","1"]
// ]
// Output: 3

class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0 || grid[0].length==0){
            return 0;
        }
        int rows = grid.length;
        int cols= grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int numOfIslands=0;
        for(int i=0;i<rows;i++){  // for checking all nodes or overall traversal
            for(int j= 0;j<cols;j++){
                if(!visited[i][j] && grid[i][j] =='1'){
                    dfs(grid,i,j,visited);
                    numOfIslands++;
                }
           }
        }
        return numOfIslands; 
    }
    public void dfs(char[][] grid , int row,int col,boolean[][] visited){
        if(row<0 || col <0 || row>=grid.length || col >= grid[row].length || visited[row][col] || grid[row][col]=='0'){
            return ;
        }
        visited[row][col] = true;
        dfs(grid,row,col-1,visited);
        dfs(grid,row-1,col,visited);
        dfs(grid,row,col+1,visited);
        dfs(grid,row+1,col,visited);

    }
}
