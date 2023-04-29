// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
// Each letter in magazine can only be used once in ransomNote.

// Example 1:
// Input: ransomNote = "a", magazine = "b"
// Output: false

// Example 2:
// Input: ransomNote = "aa", magazine = "ab"
// Output: false

// Solution:

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) 
           return false;
        int c =0;
        char[] arr = ransomNote.toCharArray();
        for(int i=0 ; i<ransomNote.length() ; i++){
            if(magazine.contains(""+ransonNote.indesOf(i))){
               magazine =  magazine.replaceFirst(""+arr[i],"");
                c++;
            }
        }
        if(c==ransomNote.length())
          return true;
        return false;

// Optimized Appoarch

		if (ransomNote.length() > magazine.length()) 
           return false;
        int[] alphabets_counter = new int[26];
        
        for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }
        return true;
    }
}