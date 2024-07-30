public class PrintListFromEnd {
    public static void printFromEnd(Node head){
        if(head==null){
            return;
        }
        printFromEnd(head.next);
        System.out.println(head.data);
    }
    public static void main(String [] args)
    {
        LinkedList ll = new LinkedList(new Node(4));
        ll.head.next = new Node(6);
        ll.head.next.next =  new Node(7);
        ll.head.next.next.next =  new Node(8);
        ll.head.next.next.next.next =  new Node(9);

        printFromEnd(ll.head);
    }
}
