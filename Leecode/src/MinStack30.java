class MinStack30 {
    Node head;
    /** initialize your data structure here. */
    public MinStack30() {

    }

    public void push(int x) {
        if(head==null){
            head=new Node(x,x,null);
        }else{
            head=new Node(x,Math.min(x,head.min),head);
        }
    }

    public void pop() {
        head=head.next;
    }

    public int top() {
        return head.val;
    }

    public int min() {
        return head.min;
    }

    class Node{
        Node next;
        int min;
        int val;

        public Node(int x,int min,Node next){
            this.val=x;
            this.min=min;
            this.next=next;
        }
    }

}