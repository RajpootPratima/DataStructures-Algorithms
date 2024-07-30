public class RotateRightByK {
    public static Node rotate(Node head, int k){
        if(head==null || head.next==null)return head;
        Node sp=head;
        Node fp=head;
        while (fp.next!=null){
            if(k>0){
                fp=fp.next;
                k--;
            }
            else{
                sp=sp.next;
                fp=fp.next;
            }
        }
        if(k==0)
        {fp.next=head;
        head=sp.next;
        sp.next=null;}
        return head;
    }
    public static void main(String [] args)
    {
        LinkedList ll = new LinkedList(new Node(4));
        ll.head.next = new Node(6);
        ll.head.next.next =  new Node(7);
        ll.head.next.next.next =  new Node(8);
        ll.head.next.next.next.next =  new Node(9);

        Node l =rotate(ll.head,3);
        ReverseLinkedList.printLl(l);
    }
}
