public class AlternatingLLFromStartToReverseOfEnd {
    public static Node mid(Node head){
        if(head==null || head.next==null)return head;
        Node sp = head;
        Node fp = head.next;
        while (fp!=null && fp.next!= null){
            sp=sp.next;
            fp=fp.next.next;
        }
        Node mid= sp.next;
        sp.next=null;
        return mid;
    }
     public static Node reverse(Node head){
        Node prev=null, next, current = head;
        while (current!=null){
            next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
     }
     public static Node rearrange(Node head){
        Node mid = mid(head);
        mid = reverse(mid);

        Node t1=head;
        Node t2=mid;
        while (t1!=null && t2!=null){
            Node n1=t1.next, n2= t2.next;
            t1.next=t2;
            t2.next=n1;
            t1=n1;
            t2=n2;
        }
        return head;
     }
    public static void main(String [] args) {
        LinkedList ll = new LinkedList(new Node(4));
        ll.head.next = new Node(6);
        ll.head.next.next = new Node(7);
        ll.head.next.next.next = new Node(8);
        ll.head.next.next.next.next = new Node(9);
        Node rev = rearrange(ll.head);
        while (rev!=null){
            System.out.println(rev.data);
            rev=rev.next;
        }
    }

}
