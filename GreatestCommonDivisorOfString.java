// For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
// Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

// Example 1:
// Input: str1 = "ABCABC", str2 = "ABC"
// Output: "ABC"
  
// Example 2:
// Input: str1 = "ABABAB", str2 = "ABAB"
// Output: "AB"
  
// Example 3:
// Input: str1 = "LEET", str2 = "CODE"
// Output: ""
  
  class Solution {
    public String gcdOfStrings(String str1, String str2) {
       int s1len = str1.length();
       int s2len = str2.length();

       if(!(str1+str2).equals(str2+str1)){
           return "";
       }

       int len = gcd(s1len,s2len);

       return str1.substring(0,len);
    }

    public int gcd ( int a , int b){
        if(b==0)
           return a;
        return gcd(b, a%b);
    }
}
