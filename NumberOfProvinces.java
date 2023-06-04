// There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.
// A province is a group of directly or indirectly connected cities and no other cities outside of the group
// You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.
// Return the total number of provinces.

// Example 1:
// Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
// Output: 2
  
// Example 2:
// Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
// Output: 3
  
  class Solution {
    public int findCircleNum(int[][] isConnected) {
        if(isConnected.length == 0 || isConnected[0].length == 0){
            return 0;
        }
        int c = 0;
        boolean[] visited = new boolean[isConnected.length];
        for(int i = 0 ; i<isConnected.length ; i++){
                if(!visited[i]){
                    dfs( i ,  isConnected , visited);
                    c++;
                }
        }
        return c;
    }

    public void dfs(int row , int[][] num , boolean[] visited){
        visited[row] = true;
        for(int col = 0 ; col < num.length ; col++){
            if(num[row][col] == 1 && !visited[col]){
                dfs(col, num , visited);
            }
        }
    }
}
