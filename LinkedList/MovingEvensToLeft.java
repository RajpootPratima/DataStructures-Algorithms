public class MovingEvensToLeft {
    public static Node moveEvensLeft(Node head){
        if (head == null||head.next==null) {
            return head;
        }
        Node even =null;
        Node event =null;
        Node odd =null;
        Node oddt =null;
        while (head!=null){
            if (head.data%2==0){
                if(even==null){
                    even=new Node(head.data);
                    event=even;
                }else {
                    event.next=new Node(head.data);
                    event=event.next;
                }
            }
            else{
                if(odd==null){
                    odd=new Node(head.data);
                    oddt=odd;
                }else {
                    oddt.next=new Node(head.data);
                    oddt=oddt.next;
                }
            }
            head=head.next;
        }
        if(even==null){
            return odd;
        }
        event.next=odd;
        return even;
    }
    public static void main(String [] args)
    {
        LinkedList ll = new LinkedList(new Node(4));
        ll.head.next = new Node(6);
        ll.head.next.next =  new Node(8);
        ll.head.next.next.next =  new Node(12);
        ll.head.next.next.next.next =  new Node(13);
        ll.head.next.next.next.next.next =  new Node(10);

        Node newHead = moveEvensLeft(ll.head);
        ReverseLinkedList.printLl(newHead);


    }
}
