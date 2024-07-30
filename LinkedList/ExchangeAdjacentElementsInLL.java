public class ExchangeAdjacentElementsInLL {
    public static Node pairWiseSwap(Node head){
        if(head==null || head.next==null)return head;
//        Setting head to correct position
        Node current = head.next.next;
        Node prev = head;
        head=head.next;
        head.next = prev;
        while (current!=null && current.next!=null){
            prev.next=current.next;
            prev=current;
            Node newCurrent = current.next.next;
            current.next.next=current;
            current = newCurrent;
        }
        prev.next=current;
        return head;

    }
    public  static  void main(String [] ar){
        LinkedList ll = new LinkedList(new Node(4));
        ll.head.next = new Node(6);
        ll.head.next.next =  new Node(6);
        ll.head.next.next.next =  new Node(4);
        ll.head.next.next.next.next =  new Node(4);
        Node newHead = pairWiseSwap(ll.head);
        ReverseLinkedList.printLl(newHead);
    }
}
