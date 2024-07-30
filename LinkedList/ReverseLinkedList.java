public class ReverseLinkedList {
    public static Node reverse(Node head){
        if(head==null){
            return null;
        }
        Node current = head;
        Node prev = null;
        while (current!=null){
            Node next = current.next;
//            if(prev==current){
//                current.setNext(null);}
//            else{
                current.setNext(prev);
//            }
            prev=current;
            current=next;

        }
        return prev;
    }
    public static void printLl(Node head){
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static void main(String [] args)
    {
        LinkedList ll = new LinkedList(new Node(4));
        ll.head.next = new Node(6);
//        ll.head.next.next =  new Node(7);
//        ll.head.next.next.next =  new Node(8);
        Node rev =reverse(ll.head);
        printLl(rev);

    }
}
