public class ReverseLinkedListRecursively {
    public static Node recursiveReverse(Node head){
        if(head==null || head.next==null) return head;
        Node newHead = recursiveReverse(head.next);
        head.next.next = head;
        head.next=null;
        return newHead;

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
        ll.head.next.next =  new Node(7);

        Node head;
        head =recursiveReverse(ll.head);
        printLl(head);

    }
}
