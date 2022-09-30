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
       ListNode ptr = head;
        if(head==null || head.next == null) return head;
        int n = 1;
        while(ptr.next != null){
            ptr = ptr.next;
            n++;
        }
        ptr.next = head;
        ptr = head;
        k = k%n;
        for(int i =0;i<n-k-1;i++){
            ptr = ptr.next;
        }
        head = ptr.next;
        ptr.next = null;
        return head;
        
    }
}