import java.util.HashMap;

public class Solution35 {
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
    HashMap<Node,Node> map=new HashMap<>();
    Node temp;
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        temp=head;
        while(temp!=null){
            map.put(temp,new Node(temp.val));
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            map.get(temp).next=temp.next;
            map.get(temp).random=temp.random;
            temp=temp.next;
        }

        return map.get(head);
    }
}
