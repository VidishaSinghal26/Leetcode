// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

// Example 1:
// Input: strs = ["flower","flow","flight"]
// Output: "fl"
  
// Example 2:
// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
  
class Solution {
    public String longestCommonPrefix(String[] strs) {
       if(strs.length == 0){
           return "";
       }
       Arrays.sort(strs);
       int i = 0;

       String A = strs[0];
       String B = strs[strs.length-1];

       while(i < A.length()){
           if(A.charAt(i) != B.charAt(i)){
               break;
           }
           else{
               i++;
           }
       }
       return A.substring(0,i);

    }
}
