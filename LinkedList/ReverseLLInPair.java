public class ReverseLLInPair {
    public static Node reverseInPair(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node temp = head.next;
        head.next =temp.next;
        temp.next=head;
        head=temp;
        head.next.next = reverseInPair(head.next.next);
        return head;
    }
    public static Node reverseInPairIterative(Node head){
        Node newHead=null;
        Node temp1=null;
        while(head!=null && head.next!=null) {
            if(temp1!=null){
                temp1.next.next=head.next;
            }
            temp1 = head.next;
            head.next = temp1.next;
            temp1.next = head;
            head=temp1;
            if(newHead==null)
            {newHead = head;}


            head = head.next.next;
        }
        return newHead;
    }
    public static void main(String [] args) {
        LinkedList ll = new LinkedList(new Node(4));
        ll.head.next = new Node(6);
        ll.head.next.next = new Node(7);
       ll.head.next.next.next = new Node(8);
       ll.head.next.next.next.next = new Node(9);
        Node rev = reverseInPairIterative(ll.head);
        while (rev!=null){
            System.out.println(rev.data);
            rev=rev.next;
        }
    }
}
