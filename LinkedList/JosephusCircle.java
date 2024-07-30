//Akkad bakkad bammbe boo assi nabbe poore sau
public class JosephusCircle {
        public static void josephusCircle(Node head, int k, int N){
            for (int count=N;count>1;count--){
                for (int i=0;i<k;i++){
                    head=head.next;
                }
                head.next=head.next.next;
            }
        System.out.println(head.data);
        }
        public static void main(String [] args) {
            LinkedList ll = new LinkedList(new Node(1));
            ll.head.next = new Node(2);
            ll.head.next.next = new Node(3);
            ll.head.next.next.next = new Node(4);
            ll.head.next.next.next.next = new Node(5);
            ll.head.next.next.next.next.next = new Node(6);
            ll.head.next.next.next.next.next.next = ll.head;
            josephusCircle(ll.head,3,6);

        }

}
