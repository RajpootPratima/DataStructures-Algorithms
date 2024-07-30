public class CommonElementsOfTwoSortedLL {
    public static Node getCommon(Node ll1,Node ll2){
        if(ll1==null || ll2==null){
            return null;
        }
        Node common = null;
        Node tmp = common;
        while (ll1!=null && ll2!=null){

            if(ll1.data==ll2.data){
                if (common==null){
                    common=new Node(ll1.data);
                    tmp=common;
                }
                else {
                    tmp.next=new Node(ll1.data);
                    tmp=tmp.next;
                }
                System.out.println(ll1.data);
                ll1=ll1.next;
                ll2=ll2.next;
            } else if (ll1.data> ll2.data) {
                ll2=ll2.next;
            }
            else if (ll1.data < ll2.data) {
                ll1=ll1.next;
            }
        }
        return common;
    }
    public static void main(String [] args)
    {
        LinkedList ll = new LinkedList(new Node(4));
        ll.head.next = new Node(5);
        ll.head.next.next =  new Node(6);
        ll.head.next.next.next =  new Node(8);
        LinkedList ll2 = new LinkedList(new Node(4));
        ll2.head.next= new Node(5);
        ll2.head.next.next= new Node(8);

        Node comm = getCommon(ll.head,ll2.head);
//        ReverseLinkedList.printLl(comm);


    }
}
