public class LinkedListEvenOrOdd {
    public static Integer evenOrOdd(Node head){
        if(head==null){
            return null;
        }
        Node fp=head;
        while (fp!=null && fp.next!=null){
            fp=fp.next.next;
        }
        if (fp==null){
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void main(String [] args)
    {
        LinkedList ll = new LinkedList(new Node(4));
        ll.head.next = new Node(6);
        ll.head.next.next =  new Node(7);
        ll.head.next.next.next =  new Node(8);
//        ll.head.next.next.next.next =  new Node(9);

        System.out.println(evenOrOdd(ll.head));

    }
}
