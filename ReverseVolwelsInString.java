// Given a string s, reverse only all the vowels in the string and return it.
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

// Example 1:
// Input: s = "hello"
// Output: "holle"

// Example 2:
// Input: s = "leetcode"
// Output: "leotcede"

class Solution {
    public String reverseVowels(String s) {
        
 //Method-1
        
        String vowels = "aeiouAEIOU";
        String ans="";
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i<s.length() ;i++){
            if(vowels.contains(""+s.charAt(i))){
                list.add(s.charAt(i));
            }
        }

        int j = list.size()-1;
        for(int i = 0 ; i<s.length() ; i++){
            if(vowels.contains(""+s.charAt(i)))
               ans += list.get(j--);
            else
                ans += s.charAt(i); 
        }
        return ans;
        
 //Method-2
        
        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = s.length()-1;
        char arr[] = s.toCharArray();

        while(start < end){
            if(!vowels.contains(""+arr[start]))
                start++;
            if(!vowels.contains(""+arr[end]))
                end--;
            if(vowels.contains(""+arr[start]) &&  vowels.contains(""+arr[end])){
                char temp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = temp;
            }
        }
        String str = String.valueOf(arr);
       return str;
    }
}
