public class MergeTwoSortedLLintoThird {
    public static Node merge(Node ll1, Node ll2){
        if(ll1==null){
            return ll2;
        }
        if(ll2==null){
            return ll1;
        }
        Node head = new Node(0);
        if(ll1.data<=ll2.data){
            head.data=ll1.data;
            head.next=merge(ll1.next,ll2);
        }
        else {
            head.data=ll2.data;
            head.next=merge(ll1,ll2.next);
        }
        return head;
    }
    public static void main(String [] args)
    {
        LinkedList ll = new LinkedList(new Node(4));
        ll.head.next = new Node(6);
        ll.head.next.next =  new Node(7);
        ll.head.next.next.next =  new Node(8);
        LinkedList ll2 = new LinkedList(new Node(3));
        ll2.head.next=new Node(5);
//        ll2.head.next.next = ll.head.next.next.next;
        Node l =merge(ll.head,ll2.head);
        while (l!=null){
            System.out.println(l.data);
            l=l.next;
        }
    }
}
