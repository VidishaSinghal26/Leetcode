// A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
// Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.

// Example 1:
// Input: arr = [3,5,1]
// Output: true
// Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.

// Example 2:
// Input: arr = [1,2,4]
// Output: false
// Explanation: There is no way to reorder the elements to obtain an arithmetic progression.
  
  class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
      
 //Brute Force (TC - O(nlogn) , SC - O(1) )
        Arrays.sort(arr);
        for(int i  = 0 ;  i< arr.length-2 ; i++){
            if((arr[i+1] - arr[i]) != (arr[i+2]-arr[i+1])){
                return false;
            }
        }
        return true;
      
 //Optimized (TC - O(n) , SC - O(n))
      
       int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int  i = 0 ; i<arr.length ; i++ ){
            max = Math.max( arr[i], max );
            min = Math.min( arr[i] , min);
        }

        HashSet<Integer> set = new HashSet<>();
        for(int a  : arr){
            set.add(a);
        }
        int d = ((max-min)+(arr.length-1)-1)/(arr.length - 1);

        for(int i  = 0 ; i< arr.length ; i++){
            int expected =  min + (i*d) ; 
            if(!set.contains(expected)){
                return false;
            } 
        }
        return true;
      
    }
}
