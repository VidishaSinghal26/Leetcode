// Given an m x n matrix, return all elements of the matrix in spiral order.
  
// Example 1:
// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,3,6,9,8,7,4,5]

// Example 2:
// Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
// Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 

// Constraints:

// m == matrix.length
// n == matrix[i].length
// 1 <= m, n <= 10
// -100 <= matrix[i][j] <= 100

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        int r = matrix.length;
        int c = matrix[0].length;
        while(i <r && j < c){
            //first row 
            for(int k = j ; k < c-1; k++){
                list.add(matrix[i][k]);
            }
            i++;
            
            // last column
            for(int k = j ; k<r ; k++){
                list.add(matrix[k][c-1]);
            }
            c--;

            if(i < r){
                for(int k = c-1 ; k>= j; k--){
                    list.add(matrix[r-1][k]);
                }
                r--;
            }
            if(j < c){
                for(int k = r-1 ; k>= i ; k--){
                    list.add(matrix[k][j]);
                }
                j++;
            }
        }

        return list;
    }
}
