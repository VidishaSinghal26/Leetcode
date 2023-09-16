**Given** the head of a linked list, rotate the list to the right by k places.

Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
  
Example 2:
Input: head = [0,1,2], k = 4
Output: [2,0,1]

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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }

        //size
        int size = 1 ;
        ListNode temp = head;
        while(temp.next != null){
            size++;
            temp = temp.next;
        }

        if(size == k){
            return head;
        }

        // creating circular linked list pointing last node to first node
        temp.next = head;

        int i = 1;
        ListNode curr = head;
        while(i < (size-(k%size)) ){
            curr = curr.next;
            i++;
        }
        head = curr.next;
        curr.next = null;

        return head;
    }
}
