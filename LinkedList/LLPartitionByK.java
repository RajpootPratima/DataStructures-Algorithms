public class LLPartitionByK {
    public static Node partition(Node head, int k){
        Node start=null;
        Node end=null;
        Node newHead=null;
        Node kStart=null;
        while (head!=null){
            if(head.data<k){
                if(start==null){
                    start=new Node(head.data);
                    newHead=start;
                }
                else{ start.next=new Node(head.data);
                start=start.next;}
            }
            else {
                if(end==null){
                    end=new Node(head.data);
                    kStart=end;

                }
                else {end.next=new Node(head.data);
                end=end.next;}

            }
            head=head.next;
        }
        start.next=kStart;
        return newHead;
    }
    public static void main(String [] args)
    {
        LinkedList ll = new LinkedList(new Node(8));
        ll.head.next = new Node(6);
        ll.head.next.next =  new Node(4);
        ll.head.next.next.next =  new Node(3);
        ll.head.next.next.next.next =  new Node(9);

        Node newHead = partition(ll.head,6);
        ReverseLinkedList.printLl(newHead);

    }
}
