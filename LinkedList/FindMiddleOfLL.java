public class FindMiddleOfLL {
    public static Node findMid(Node head){
        if(head==null){
            return null;
        }
        Node sp = head;
        Node fp = head;
        while (fp!=null){
            if (fp.next==null){
                break;
            }
            sp=sp.next;
            fp=fp.next.next;

        }
        System.out.println(fp);
        return sp;
    }
    public static void main(String [] args)
    {
        LinkedList ll = new LinkedList(new Node(4));
        ll.head.next = new Node(6);
        ll.head.next.next =  new Node(7);
        ll.head.next.next.next =  new Node(8);
        ll.head.next.next.next.next =  new Node(9);

        Node l =findMid(ll.head);
        if(l==null){
            System.out.println(l);
        }
        else{
            System.out.println(l.data);}
    }
}
