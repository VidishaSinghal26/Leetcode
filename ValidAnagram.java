// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

// Example 1:
// Input: s = "anagram", t = "nagaram"
// Output: true
  
// Example 2:
// Input: s = "rat", t = "car"
// Output: false
  
  class Solution {
    public boolean isAnagram(String s, String t) {
      
     char A[] = s.toCharArray();
     char B[] = t.toCharArray();

     HashMap<Character , Integer> map = new HashMap<>();
    
     for(char a: A){
         map.put(a, map.getOrDefault(a,0)+1);
      }

      for(int i = 0 ; i<t.length() ; i++){
          if(!map.containsKey(B[i])){
               return false;
           }
          else{
              map.put(B[i] , map.get(B[i])-1);
              if(map.get(B[i]) == 0){
                  map.remove(B[i]);
               }
           }
        }
        if(!map.isEmpty())
           return false;
        return true;
    }
}
