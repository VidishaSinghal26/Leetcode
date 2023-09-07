// Given the head of a linked list, remove the nth node from the end of the list and return its head.

// Example 1:
// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]
  
// Example 2:
// Input: head = [1], n = 1
// Output: []
  
// Example 3:
// Input: head = [1,2], n = 1
// Output: [1]

  /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }

      // size of linked list
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

      // when size of linked list and nth node from last to deleted are same then head node should be deleted
        if(n == size){
            return head.next;
        }

      // point will provide nth node from starting 
        int point = size-n;
        ListNode curr = head;
        int i = 1;
        while(i < point){
            curr = curr.next;
            i++;
        }

        curr.next = curr.next.next;
        return head;
    }
}
