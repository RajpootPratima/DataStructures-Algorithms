public class ReverseInGroups {
    public static Node reverseInGroups(Node head, int k){
        if (head==null || head.next==null)return head;
        Node current = head;
        Node prev = null;
        Node next = null;
        int count = 0;
        while (count<k && current!=null){
            next = current.next;
            current.next=prev;
            prev = current;
            current=next;
            count++;

        }
        head.next=reverseInGroups(next,k);
        return prev;
    }
    public static void main(String [] args) {
        LinkedList ll = new LinkedList(new Node(4));
        ll.head.next = new Node(6);
        ll.head.next.next = new Node(7);
        ll.head.next.next.next = new Node(8);
        ll.head.next.next.next.next = new Node(9);
        ll.head.next.next.next.next.next = new Node(10);
        Node rev = reverseInGroups(ll.head,3);
        while (rev!=null){
            System.out.println(rev.data);
            rev=rev.next;
        }
    }
}
