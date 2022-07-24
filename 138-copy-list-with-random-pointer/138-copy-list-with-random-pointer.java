/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> hm = new HashMap<>();
        return copyRandomList(head, hm);
    }
    
    public Node copyRandomList(Node head, HashMap<Node, Node> hm){
        if(head == null) return null; 
        Node ap = new Node(head.val);
        hm.put(head, ap);
        ap.next = copyRandomList(head.next, hm);
        ap.random = hm.get(head.random);           
        return ap;
    }
}