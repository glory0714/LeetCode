import java.util.ArrayList;
import java.util.List;

class Solution06 {
    ArrayList<Integer> list=new ArrayList<>();
    public int[] reversePrint(ListNode head) {
        rever(head);
        int[] d = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            d[i] = list.get(i);
        }
        return d;
    }
    public void rever(ListNode head){
        if (head == null) {
            return;
        }

        if(head.next!=null){
            rever(head.next);
        }
        list.add(head.val);
    }
    
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}