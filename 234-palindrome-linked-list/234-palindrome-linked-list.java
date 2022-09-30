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
    ListNode ptr1 = null;                                 
    public boolean isPalindrome(ListNode head) {
        ptr1 = head;                                      
        return isPallindromeCheck(head);
    }
    public boolean isPallindromeCheck(ListNode head) {
        if(head == null) return true;
        
        boolean res = isPallindromeCheck(head.next);     
        if(res) {
            if(ptr1.val == head.val) {
                ptr1 = ptr1.next;                         
                return true;
            }
        }
        return false;
    }
}