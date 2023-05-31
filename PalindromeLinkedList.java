// Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

// Example 1:
// Input: head = [1,2,2,1]
// Output: true
  
// Example 2:
// Input: head = [1,2]
// Output: false
  
  class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null)
          return true;
        
        List<Integer> list = new ArrayList();
        list.add(head.val);

        while (head.next != null) {
            head = head.next;
            list.add(head.val);
        }

        for (int i = 0; i < list.size() / 2; i++) {
            if (!list.get(i).equals( list.get( list.size() - i - 1 )))
                return false;
        }

        return true;
    }
}
