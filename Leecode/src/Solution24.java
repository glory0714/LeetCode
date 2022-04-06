import java.util.List;

public class Solution24 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    ListNode Chead;
    ListNode temp=null;
    ListNode temp2=null;
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next!=null){
            temp2=head.next;
        temp=head.next.next;}else{return head;}
        head.next.next=head;
        head.next=null;
        rever(temp2,temp);
        return Chead;
    }

    public void rever(ListNode l1,ListNode l2){
        if(l2==null){
            Chead=l1;
            return;
        }
        temp=l2.next;
        l2.next=l1;
        rever(l2,temp);
    }

}
