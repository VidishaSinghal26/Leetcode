// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

// Example 1:
// Input: s = "leetcode"
// Output: 0

// Example 2:
// Input: s = "loveleetcode"
// Output: 2

// Example 3:
// Input: s = "aabb"
// Output: -1

Solution:

class Solution {
    public int firstUniqChar(String s) {

    //Hash Map Approach
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for(char ch : arr){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        } 
        for(int i = 0 ; i <arr.length ; i++){
            if(map.get(arr[i])==1){
                return i;
            }
        }
        return -1;

//Optimized Apporach (two pointer)

        int res=Integer.MAX_VALUE;
       for(char i='a';i<='z';i++){
            int first=s.indexOf(i);
            int last=s.lastIndexOf(i);
            if(first !=-1 && first==last)
                res=Math.min(res,first); 
       }
        return res==Integer.MAX_VALUE?-1:res;
    }
}
